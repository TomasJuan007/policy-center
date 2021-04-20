package com.github.tomasjuan007.policycenter.strategy.base;

import com.github.tomasjuan007.policycenter.strategy.OpStrategy;

public class AnyStrategy implements OpStrategy {
    @Override
    public boolean execute(String myVal, Object val) {
        return true;
    }

    @Override
    public boolean validate(Object val) {
        return true;
    }
}
