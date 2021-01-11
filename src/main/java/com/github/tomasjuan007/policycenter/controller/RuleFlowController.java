package com.github.tomasjuan007.policycenter.controller;

import com.github.tomasjuan007.policycenter.dal.model.TbRule;
import com.github.tomasjuan007.policycenter.service.RuleFlowService;
import com.github.tomasjuan007.policycenter.service.RuleService;
import com.github.tomasjuan007.policycenter.vo.lane.Conclusion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController("ruleFlow")
public class RuleFlowController {
    @Autowired
    private RuleFlowService ruleFlowService;
    @Autowired
    private RuleService ruleService;

    @GetMapping("conclusion")
    public Conclusion getConclusion(@RequestBody Map<String, String> facts) {
        List<TbRule> ruleList = new ArrayList<>();
        ruleFlowService.setRuleList(ruleList);
        return ruleFlowService.getConclusion(facts);
    }

    @GetMapping("conclusion-lane")
    public Conclusion getConclusionByLane(@RequestBody Map<String, String> facts) {
        List<TbRule> ruleList = ruleService.getRuleListByPreOrderReversal();
        ruleFlowService.setRuleList(ruleList);
        return ruleFlowService.getConclusion(facts);
    }
}
