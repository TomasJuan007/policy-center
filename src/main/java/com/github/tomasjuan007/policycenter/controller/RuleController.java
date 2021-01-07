package com.github.tomasjuan007.policycenter.controller;

import com.github.tomasjuan007.policycenter.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RuleController {
    @Autowired
    private RuleService ruleService;

    @PostMapping("rule")
    public String addRule(@RequestParam(value = "name")String name,
                          @RequestParam(value = "val")String val) {
        return ruleService.addRoot(name, val).toString();
    }
}
