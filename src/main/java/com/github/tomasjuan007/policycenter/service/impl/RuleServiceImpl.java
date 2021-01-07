package com.github.tomasjuan007.policycenter.service.impl;

import com.github.tomasjuan007.policycenter.dal.mapper.TbRuleMapper;
import com.github.tomasjuan007.policycenter.dal.model.TbRule;
import com.github.tomasjuan007.policycenter.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RuleServiceImpl implements RuleService {
    @Autowired
    private TbRuleMapper ruleMapper;

    @Override
    public Long addRoot(String name, String val) {
        TbRule rule = new TbRule();
        rule.setName(name);
        rule.setVal(val);
        long ruleId = System.currentTimeMillis();
        rule.setRuleId(ruleId);
        int affectRows = ruleMapper.insertSelective(rule);
        if (affectRows > 0) {
            return ruleId;
        }
        return null;
    }
}
