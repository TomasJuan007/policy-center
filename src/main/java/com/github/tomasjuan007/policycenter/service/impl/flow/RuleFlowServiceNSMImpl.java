package com.github.tomasjuan007.policycenter.service.impl.flow;

import com.github.tomasjuan007.policycenter.dal.mapper.TbRuleMapper;
import com.github.tomasjuan007.policycenter.dal.model.TbRuleExample;
import com.github.tomasjuan007.policycenter.vo.nsm.RuleNode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class RuleFlowServiceNSMImpl extends AbstractRuleFlowService implements RuleFlowNSMService {
    @Autowired
    private TbRuleMapper ruleMapper;

    private Set<Long> matchIdSet = new HashSet<>();

    @Override
    public List<Long> getHitRuleIds(Map<String, String> facts) {
        TbRuleExample example = new TbRuleExample();
        List<RuleNode> ruleNodeList = ruleMapper.selectRuleNodesByExample(example);
        if (ruleNodeList==null) {
            return null;
        }
        Map<Long, List<RuleNode>> ruleNodeListGroupByRuleId = ruleNodeList.stream().collect(Collectors.groupingBy(RuleNode::getRuleId));
        List<Long> hitList = new ArrayList<>();
        for (Map.Entry<Long, List<RuleNode>> entry : ruleNodeListGroupByRuleId.entrySet()) {
            List<RuleNode> ruleNodes = entry.getValue();
            Map<String, RuleNode> ruleNodeMap = new HashMap<>();
            ruleNodes.forEach(e -> ruleNodeMap.put(e.getId().toString(), e));
            List<Long> idList = ruleNodes.stream()
                    .filter(e -> e.getLvl()==0 && doOperate(facts, e.getName(), e.getVal(), e.getOp()))
                    .map(RuleNode::getId)
                    .collect(Collectors.toList());
            matchIdSet.clear();
            Boolean hit = recursive(facts, idList, ruleNodeMap);
            if (!CollectionUtils.isEmpty(idList) && hit!=null && hit) {
                hitList.add(entry.getKey());
            }
        }

        return hitList;
    }

    private Boolean recursive(Map<String, String> facts,
                              List<Long> idList,
                              Map<String, RuleNode> ruleNodeMap) {
        if (CollectionUtils.isEmpty(idList)) {
            return true;
        }
        for (Long id : idList) {
            RuleNode ruleNode = ruleNodeMap.get(id.toString());
            if (ruleNode == null) {
                return null;
            }
            Long nodeId = ruleNode.getId();
            if (matchIdSet.contains(nodeId)) {
                continue;
            }
            if (!doOperate(facts, ruleNode.getName(), ruleNode.getVal(), ruleNode.getOp())) {
                continue;
            }
            String childIds = ruleNode.getChildIds();
            if (StringUtils.isBlank(childIds)) {
                return true;
            }
            for (String childId : childIds.split(",")) {
                RuleNode childNode = ruleNodeMap.get(childId);
                if (childNode == null) {
                    return null;
                }
                if (!doOperate(facts, childNode.getName(), childNode.getVal(), childNode.getOp())) {
                    continue;
                }

                matchIdSet.add(childNode.getId());

                String ids = childNode.getChildIds();
                if (StringUtils.isBlank(ids)) {
                    return true;
                }
                List<Long> idsLong = new ArrayList<>();
                String[] idsStr = ids.split(",");
                for (String idStr : idsStr) {
                    idsLong.add(Long.parseLong(idStr));
                }
                Boolean status = recursive(facts, idsLong, ruleNodeMap);
                if (status!=null && status) {
                    return true;
                }

            }
        }
        return false;
    }
}
