package com.github.tomasjuan007.policycenter.controller;

import com.github.tomasjuan007.policycenter.dal.model.TbRule;
import com.github.tomasjuan007.policycenter.service.RuleFlowService;
import com.github.tomasjuan007.policycenter.service.RuleService;
import com.github.tomasjuan007.policycenter.vo.Conclusion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class RuleController {
    @Autowired
    private RuleFlowService ruleFlowService;
    @Autowired
    private RuleService ruleService;


    @GetMapping("conclusion")
    public Conclusion getConclusion(@RequestBody Map<String, String> facts) {
        List<TbRule> ruleList = ruleService.getRuleListByPreOrderReversal();
        ruleFlowService.setRuleList(ruleList);
        return ruleFlowService.getConclusion(facts);
    }


    @PostMapping("rule")
    public String addRule(@RequestParam(value = "name")String name,
                          @RequestParam(value = "val")String val) {
        return ruleService.addRoot(name, val).toString();
    }

    @PostMapping("pattern")
    public String addPattern(@RequestParam(value = "pid")Long pid,
                             @RequestParam(value = "name")String name,
                             @RequestParam(value = "val")String val,
                             @RequestParam(value = "op")String op) {
        return ruleService.addChild(pid, name, val, op).toString();
    }
}
