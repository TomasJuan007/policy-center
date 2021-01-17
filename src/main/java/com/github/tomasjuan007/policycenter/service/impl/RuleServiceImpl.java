package com.github.tomasjuan007.policycenter.service.impl;

import com.github.tomasjuan007.policycenter.dal.mapper.TbRuleMapper;
import com.github.tomasjuan007.policycenter.dal.model.TbRule;
import com.github.tomasjuan007.policycenter.dal.model.TbRuleExample;
import com.github.tomasjuan007.policycenter.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

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
        ruleMapper.incrRgtByExample(2L, incrRgtExample);

        TbRuleExample incrLftExample = new TbRuleExample();
        incrLftExample.createCriteria()
                .andRuleIdEqualTo(ruleId)
                .andLftGreaterThanOrEqualTo(pattern.getRgt());
        ruleMapper.incrLftByExample(2L, incrLftExample);

        int affectRows = ruleMapper.insertSelective(pattern);
        if (affectRows > 0) {
            return pattern.getRuleId();
        } else {
            return 0L;
        }
    }

    @Override
    public List<TbRule> getRootNodes(String app) {
        TbRuleExample example = new TbRuleExample();
        example.createCriteria()
                .andAppEqualTo(app)
                .andLvlEqualTo(0L);
        return ruleMapper.selectByExample(example);
    }

    @Override
    public List<TbRule> getChildNodes(Long id) {
        TbRule parent = ruleMapper.selectByPrimaryKey(id);
        if (parent == null) {
            return new ArrayList<>();
        }

        Long ruleId = parent.getRuleId();
        Long lft = parent.getLft();
        Long rgt = parent.getRgt();
        Long lvl = parent.getLvl();

        TbRuleExample example = new TbRuleExample();
        example.createCriteria()
                .andRuleIdEqualTo(ruleId)
                .andLftGreaterThan(lft)
                .andRgtLessThan(rgt)
                .andLvlEqualTo(lvl+1);
        return ruleMapper.selectByExample(example);
    }

    @Override
    public Long editNode(Long id, String name, String val, String op) {
        TbRule record = new TbRule();
        record.setId(id);
        record.setName(name);
        record.setVal(val);
        record.setOp(op);
        ruleMapper.updateByPrimaryKeySelective(record);
        return id;
    }

    @Override
    @Transactional
    public Long deleteNode(Long id, boolean safe) throws Exception {
        TbRule node = ruleMapper.selectByPrimaryKey(id);

        Long ruleId = node.getRuleId();
        Long lft = node.getLft();
        Long rgt = node.getRgt();
        long incr = rgt - lft + 1;
        if (incr != 2 && !safe) {
            throw new Exception("The node has children! You can set 'safe' true and try again.");
        }

        TbRuleExample deleteExample = new TbRuleExample();
        deleteExample.createCriteria()
                .andRuleIdEqualTo(ruleId)
                .andLftGreaterThanOrEqualTo(lft)
                .andRgtLessThanOrEqualTo(rgt);
        int affectRows = ruleMapper.deleteByExample(deleteExample);

        TbRuleExample incrRgtExample = new TbRuleExample();
        incrRgtExample.createCriteria()
                .andRuleIdEqualTo(ruleId)
                .andRgtGreaterThanOrEqualTo(rgt);
        ruleMapper.incrRgtByExample(-incr, incrRgtExample);

        TbRuleExample incrLftExample = new TbRuleExample();
        incrLftExample.createCriteria()
                .andRuleIdEqualTo(ruleId)
                .andLftGreaterThanOrEqualTo(rgt);
        ruleMapper.incrLftByExample(-incr, incrLftExample);

        if (affectRows > 0) {
            return node.getRuleId();
        } else {
            return 0L;
        }
    }
}
