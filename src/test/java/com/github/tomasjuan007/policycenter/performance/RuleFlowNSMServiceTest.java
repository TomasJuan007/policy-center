package com.github.tomasjuan007.policycenter.performance;

import com.github.tomasjuan007.policycenter.dal.mapper.TbRuleExtMapper;
import com.github.tomasjuan007.policycenter.service.impl.flow.RuleFlowServiceNSMImpl;
import com.github.tomasjuan007.policycenter.vo.nsm.RuleNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class RuleFlowNSMServiceTest {
    @Autowired
    private TbRuleExtMapper ruleExtMapper;

    @Test
    public void testORMode() throws Exception {
        List<RuleNode> nodeList = ruleExtMapper.selectNodesWithParentId();
        List<RuleNode> leafNodeList = ruleExtMapper.selectLeafNodesByPreOrderReversal();
        RuleFlowServiceNSMImpl ruleFlowNSMService = new RuleFlowServiceNSMImpl();
        TpsWorkbench.run(()->{
            Map<String,String> facts = new HashMap<>(3);
            facts.put("age", "25");
            facts.put("area", "深圳");
            facts.put("gender", "女性");
            ruleFlowNSMService.getHitRuleIdsORModeBy(facts,nodeList,leafNodeList);
        });
    }

    @Test
    public void testANDMode() throws Exception {
        List<RuleNode> orderedNodeList = ruleExtMapper.selectNodesBySubOrderReversal();
        RuleFlowServiceNSMImpl ruleFlowNSMService = new RuleFlowServiceNSMImpl();
        TpsWorkbench.run(()->{
            Map<String,String> facts = new HashMap<>(3);
            facts.put("age", "26");
            facts.put("area", "深圳");
            facts.put("gender", "女性");
            ruleFlowNSMService.getHitRuleIdsANDModeBy(facts,orderedNodeList);
        });
    }
}
