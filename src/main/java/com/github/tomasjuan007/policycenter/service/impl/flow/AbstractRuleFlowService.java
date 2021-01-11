package com.github.tomasjuan007.policycenter.service.impl.flow;

import com.github.tomasjuan007.policycenter.dal.model.TbRule;
import com.github.tomasjuan007.policycenter.service.RuleFlowService;
import com.github.tomasjuan007.policycenter.strategy.OpStrategy;
import com.github.tomasjuan007.policycenter.strategy.OpStrategyFactory;

import java.util.Map;

public abstract class AbstractRuleFlowService implements RuleFlowService {
    public boolean doOperate(Map<String, String> facts, TbRule tbRule) {
        String op = tbRule.getOp();
        OpStrategy opStrategy = OpStrategyFactory.getOpStrategy(op);
        if (opStrategy == null) {
            return false;
        }
        String name = tbRule.getName();
        String myVal = facts.get(name);
        String val = tbRule.getVal();
        return opStrategy.execute(myVal, val);
    }
}
