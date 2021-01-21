package com.github.tomasjuan007.policycenter.performance;

import com.github.tomasjuan007.policycenter.dal.mapper.TbRuleMapper;
import com.github.tomasjuan007.policycenter.dal.model.TbRule;
import com.github.tomasjuan007.policycenter.dal.model.TbRuleExample;
import com.github.tomasjuan007.policycenter.service.impl.flow.RuleFlowServiceLaneImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class RuleFlowLaneServiceTest {
    @Autowired
    private TbRuleMapper ruleMapper;

    @Test
    public void test() throws Exception {
        TbRuleExample example = new TbRuleExample();
        example.setOrderByClause("rule_id,lft desc");
        List<TbRule> ruleList = ruleMapper.selectByExample(example);
        RuleFlowServiceLaneImpl ruleFlowLaneService = new RuleFlowServiceLaneImpl();
        TpsWorkbench.run(()->{
            Map<String,String> facts = new HashMap<>(3);
            facts.put("age", "26");
            facts.put("area", "深圳");
            facts.put("gender", "女性");
            ruleFlowLaneService.getConclusionBy(facts,ruleList);
        });
    }
}
