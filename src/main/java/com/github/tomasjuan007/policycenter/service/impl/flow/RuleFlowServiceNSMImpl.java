package com.github.tomasjuan007.policycenter.service.impl.flow;

import com.github.tomasjuan007.policycenter.dal.mapper.TbRuleExtMapper;
import com.github.tomasjuan007.policycenter.vo.nsm.RuleNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class RuleFlowServiceNSMImpl extends AbstractRuleFlowService implements RuleFlowNSMService {
    @Autowired
    private TbRuleExtMapper ruleExtMapper;

    @Override
    public List<Long> getHitRuleIdsORMode(Map<String, String> facts) {
        List<RuleNode> nodeList = ruleExtMapper.selectNodesWithParentId();
        List<RuleNode> orderedLeafNodeList = ruleExtMapper.selectLeafNodesByPreOrderReversal();
        return getHitRuleIdsORModeBy(facts,nodeList,orderedLeafNodeList);
    }

    @Override
    public List<Long> getHitRuleIdsANDMode(Map<String, String> facts) {
        List<RuleNode> orderedNodeList = ruleExtMapper.selectNodesBySubOrderReversal();
        return getHitRuleIdsANDModeBy(facts,orderedNodeList);
    }

    public List<Long> getHitRuleIdsORModeBy(Map<String, String> facts,
                                             List<RuleNode> nodeList,
                                             List<RuleNode> orderedLeafNodeList) {
        List<Long> hitList = new ArrayList<>();
        //维护一个节点映射表方便通过ID获取节点
        if (nodeList==null) {
            return new ArrayList<>();
        }
        Map<Long, RuleNode> ruleNodeMap = new HashMap<>();
        nodeList.forEach(e -> ruleNodeMap.put(e.getId(), e));
        //按规则分组处理
        Map<Long, List<RuleNode>> collect = orderedLeafNodeList.stream().collect(Collectors.groupingBy(RuleNode::getRuleId));
        for (Map.Entry<Long, List<RuleNode>> leafNodeByRuleListEntry : collect.entrySet()) {
            //叶子节点按前序倒序入栈
            Deque<RuleNode> stack = new LinkedList<>();
            List<RuleNode> leafNodeByRuleList = leafNodeByRuleListEntry.getValue();
            for (RuleNode leafNode : leafNodeByRuleList) {
                stack.push(leafNode);
            }
            Long rgtThreshold = 0L;
            while (!stack.isEmpty()) {
                RuleNode leafNode = stack.pop();
                String name = leafNode.getName();
                String val = leafNode.getVal();
                String op = leafNode.getOp();
                Long rgt = leafNode.getRgt();
                Long lvl = leafNode.getLvl();
                //保持按前序顺序处理，由于按照由叶子节点往根节点顺序执行，前序小于当前处理节点对规则无效
                if (rgt < rgtThreshold) {
                    continue;
                }
                rgtThreshold = rgt;
                //判断模式节点是否匹配
                boolean status = doOperate(facts, name, val, op);
                //到达根节点
                if (lvl == 0) {
                    if (status) {
                        hitList.add(leafNode.getRuleId());
                    }
                    continue;
                }
                //如果匹配，向上处理父节点
                if (status) {
                    Long pid = leafNode.getPid();
                    RuleNode parentNode = ruleNodeMap.get(pid);
                    if (parentNode!=null) {
                        stack.push(parentNode);
                    }
                }
            }
        }
        return hitList;
    }

    public List<Long> getHitRuleIdsANDModeBy(Map<String, String> facts,
                                             List<RuleNode> orderedNodeList) {
        List<Long> hitList = new ArrayList<>();
        //维护一个节点映射表方便通过ID获取节点
        if (orderedNodeList==null) {
            return new ArrayList<>();
        }
        Map<Long, RuleNode> ruleNodeMap = new HashMap<>();
        orderedNodeList.forEach(e -> ruleNodeMap.put(e.getId(), e));
        //按规则分组处理
        Map<Long, List<RuleNode>> collect = orderedNodeList.stream().collect(Collectors.groupingBy(RuleNode::getRuleId));
        for (Map.Entry<Long, List<RuleNode>> leafNodeByRuleListEntry : collect.entrySet()) {
            //节点按前序倒序入栈
            Deque<RuleNode> stack = new LinkedList<>();
            List<RuleNode> leafNodeByRuleList = leafNodeByRuleListEntry.getValue();
            for (RuleNode leafNode : leafNodeByRuleList) {
                stack.push(leafNode);
            }
            Long rgtThreshold = 0L;
            boolean previousStatus = false;
            Long previousLvl = null;
            while (!stack.isEmpty()) {
                RuleNode leafNode = stack.pop();
                String name = leafNode.getName();
                String val = leafNode.getVal();
                String op = leafNode.getOp();
                Long rgt = leafNode.getRgt();
                Long lvl = leafNode.getLvl();
                //保持按后序顺序处理，由于按照由叶子节点往根节点顺序执行，后序小于当前处理节点对规则无效
                if (rgt <= rgtThreshold) {
                    continue;
                }
                rgtThreshold = rgt;
                //判断模式节点是否匹配
                boolean status = doOperate(facts, name, val, op);
                //到达根节点(栈底)
                if (lvl == 0) {
                    if (previousStatus || status) {
                        hitList.add(leafNode.getRuleId());
                    }
                    continue;
                }
                //由下层成功匹配而来
                boolean fromBelow = previousLvl==null || previousLvl.equals(lvl+1);
                if (previousStatus && fromBelow) {
                    previousLvl = lvl;
                    continue;
                }
                //判断模式节点是否匹配，如果不匹配则向上处理父节点
                if (!status) {
                    Long pid = leafNode.getPid();
                    RuleNode parentNode = ruleNodeMap.get(pid);
                    if (parentNode!=null) {
                        stack.push(parentNode);
                    }
                }
                previousStatus = status;
                previousLvl = lvl;
            }
        }
        return hitList;
    }
}
