package com.github.tomasjuan007.policycenter.strategy;

public class AnyStrategy implements OpStrategy {
    @Override
    public boolean execute(String myVal, String val) {
        return true;
    }
}
