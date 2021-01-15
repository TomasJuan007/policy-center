package com.github.tomasjuan007.policycenter.performance;

import com.github.tomasjuan007.policycenter.service.impl.flow.RuleFlowNSMService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class RuleFlowNSMServiceTest {
    @Autowired
    private RuleFlowNSMService ruleFlowNSMService;

    @Test
    public void test() throws Exception {
        TpsWorkbench.run(()->{
            Map<String,String> facts = new HashMap<>(3);
            facts.put("age", "25");
            facts.put("area", "深圳");
            facts.put("gender", "女性");
            ruleFlowNSMService.getHitRuleIds(facts);
        });
    }
}
