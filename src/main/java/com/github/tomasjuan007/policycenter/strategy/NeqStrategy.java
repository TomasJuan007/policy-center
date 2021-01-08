package com.github.tomasjuan007.policycenter.strategy;

public class NeqStrategy implements OpStrategy {
    @Override
    public boolean execute(String myVal, String val) {
        if (myVal == null) {
            return false;
        }
        return !myVal.equals(val);
    }
}
