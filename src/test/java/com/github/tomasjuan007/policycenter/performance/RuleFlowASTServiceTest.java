package com.github.tomasjuan007.policycenter.performance;

import com.github.tomasjuan007.policycenter.dal.mapper.TbRuleExtMapper;
import com.github.tomasjuan007.policycenter.service.impl.flow.RuleFlowServiceASTImpl;
import com.github.tomasjuan007.policycenter.vo.nsm.RuleNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class RuleFlowASTServiceTest {
    @Autowired
    private TbRuleExtMapper ruleExtMapper;

    @Test
    public void test() throws Exception {
        List<RuleNode> orderedNodeList = ruleExtMapper.selectNodesBySubOrderReversal();
        RuleFlowServiceASTImpl ruleFlowASTService = new RuleFlowServiceASTImpl();
        TpsWorkbench.run(()->{
            Map<String,String> facts = new HashMap<>(3);
            facts.put("age", "26");
            facts.put("area", "深圳");
            facts.put("gender", "女性");
            ruleFlowASTService.getHitRuleIdsBy(facts,orderedNodeList);
        });
    }
}
