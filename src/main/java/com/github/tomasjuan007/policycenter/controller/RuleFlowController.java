package com.github.tomasjuan007.policycenter.controller;

import com.github.tomasjuan007.policycenter.dal.model.TbRule;
import com.github.tomasjuan007.policycenter.service.RuleService;
import com.github.tomasjuan007.policycenter.service.impl.flow.RuleFlowLaneService;
import com.github.tomasjuan007.policycenter.service.impl.flow.RuleFlowNSMService;
import com.github.tomasjuan007.policycenter.vo.lane.Conclusion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("ruleFlow")
public class RuleFlowController {
    @Autowired
    private RuleFlowLaneService ruleFlowLaneService;
    @Autowired
    private RuleService ruleService;
    @Autowired
    private RuleFlowNSMService ruleFlowNSMService;

    @GetMapping("hitRuleIds")
    public List<Long> getHitRuleIds(@RequestBody Map<String, String> facts) {
        return ruleFlowNSMService.getHitRuleIds(facts);
    }

    @GetMapping("conclusion")
    public Conclusion getConclusionByLane(@RequestBody Map<String, String> facts) {
        List<TbRule> ruleList = ruleService.getRuleListByPreOrderReversal();
        ruleFlowLaneService.setRuleList(ruleList);
        return ruleFlowLaneService.getConclusion(facts);
    }
}
