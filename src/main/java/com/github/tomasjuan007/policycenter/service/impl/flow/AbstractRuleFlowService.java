package com.github.tomasjuan007.policycenter.service.impl.flow;

import com.github.tomasjuan007.policycenter.strategy.OpStrategy;
import com.github.tomasjuan007.policycenter.strategy.OpStrategyFactory;

import java.util.Map;

public abstract class AbstractRuleFlowService {

    public boolean doOperate(Map<String, String> facts, String name, String val, String op) {
        OpStrategy opStrategy = OpStrategyFactory.getOpStrategy(op);
        if (opStrategy == null) {
            return false;
        }
        String myVal = facts.get(name);
        return opStrategy.execute(myVal, val);
    }
}
