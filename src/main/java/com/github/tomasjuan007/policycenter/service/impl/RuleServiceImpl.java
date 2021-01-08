package com.github.tomasjuan007.policycenter.service.impl;

import com.github.tomasjuan007.policycenter.dal.mapper.TbRuleMapper;
import com.github.tomasjuan007.policycenter.dal.model.TbRule;
import com.github.tomasjuan007.policycenter.dal.model.TbRuleExample;
import com.github.tomasjuan007.policycenter.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RuleServiceImpl implements RuleService {
    @Autowired
    private TbRuleMapper ruleMapper;

    @Override
    public List<TbRule> getRuleListByPreOrderReversal() {
        TbRuleExample example = new TbRuleExample();
        example.setOrderByClause("rule_id,lft desc");
        return ruleMapper.selectByExample(example);
    }

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

    @Override
    @Transactional
    public Long addChild(Long pid, String name, String val, String op) {
        TbRule parent = ruleMapper.selectByPrimaryKey(pid);
        if (parent == null) {
            return 0L;
        }

        Long ruleId = parent.getRuleId();
        Long lvl = parent.getLvl();
        Long rgt = parent.getRgt();
        TbRule pattern = new TbRule();
        pattern.setRuleId(ruleId);
        pattern.setName(name);
        pattern.setVal(val);
        pattern.setOp(op);
        pattern.setLvl(lvl+1);
        pattern.setLft(rgt);
        pattern.setRgt(rgt+1);

        TbRuleExample incrRgtExample = new TbRuleExample();
        incrRgtExample.createCriteria()
                .andRuleIdEqualTo(ruleId)
                .andRgtGreaterThanOrEqualTo(pattern.getLft());
        ruleMapper.incrRgtByExample(2, incrRgtExample);

        TbRuleExample incrLftExample = new TbRuleExample();
        incrLftExample.createCriteria()
                .andRuleIdEqualTo(ruleId)
                .andLftGreaterThanOrEqualTo(pattern.getRgt());
        ruleMapper.incrLftByExample(2, incrLftExample);

        int affectRows = ruleMapper.insertSelective(pattern);
        if (affectRows > 0) {
            return pattern.getRuleId();
        } else {
            return 0L;
        }
    }
}
