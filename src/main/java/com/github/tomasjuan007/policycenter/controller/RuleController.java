package com.github.tomasjuan007.policycenter.controller;

import com.github.tomasjuan007.policycenter.dal.model.TbRule;
import com.github.tomasjuan007.policycenter.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rule")
public class RuleController {
    @Autowired
    private RuleService ruleService;

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

    @GetMapping("rootNodes")
    public List<TbRule> getRootNodes(@RequestParam(value = "app")String app) {
        return ruleService.getRootNodes(app);
    }

    @GetMapping("childNodes")
    public List<TbRule> getChildNodes(@RequestParam(value = "id")Long id) {
        return ruleService.getChildNodes(id);
    }

    @PutMapping("/node")
    public String editNode(@RequestParam(value = "id")Long id,
                           @RequestParam(value = "name", required = false)String name,
                           @RequestParam(value = "val", required = false)String val,
                           @RequestParam(value = "op", required = false)String op) {
        return ruleService.editNode(id, name, val, op).toString();
    }

    @DeleteMapping("/node")
    public String deleteNode(@RequestParam(value = "id")Long id,
                             @RequestParam(value = "safe", required = false)boolean safe) {
        try {
            return ruleService.deleteNode(id, safe).toString();
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
