package com.github.tomasjuan007.policycenter.controller;

import com.github.tomasjuan007.policycenter.service.impl.flow.RuleFlowASTService;
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
    private RuleFlowASTService ruleFlowASTService;
    @Autowired
    private RuleFlowNSMService ruleFlowNSMService;
    @Autowired
    private RuleFlowLaneService ruleFlowLaneService;

    @GetMapping("hitRuleIds")
    public List<Long> getHitRuleIds(@RequestBody Map<String, String> facts) {
        return ruleFlowASTService.getHitRuleIds(facts);
    }

    @GetMapping("hitRuleIds-or")
    public List<Long> getHitRuleIdsORMode(@RequestBody Map<String, String> facts) {
        return ruleFlowNSMService.getHitRuleIdsORMode(facts);
    }

    @GetMapping("hitRuleIds-and")
    public List<Long> getHitRuleIdsANDMode(@RequestBody Map<String, String> facts) {
        return ruleFlowNSMService.getHitRuleIdsANDMode(facts);
    }

    @GetMapping("conclusion")
    public Conclusion getConclusionByLane(@RequestBody Map<String, String> facts) {
        return ruleFlowLaneService.getConclusion(facts);
    }
}
