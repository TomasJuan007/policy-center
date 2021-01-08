package com.github.tomasjuan007.policycenter.strategy;

public class GtStrategy implements OpStrategy {
    @Override
    public boolean execute(String myVal, String val) {
        if (myVal == null) {
            return false;
        }
        return Integer.parseInt(myVal) > Integer.parseInt(val);
    }
}
