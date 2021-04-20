package com.github.tomasjuan007.policycenter.strategy;

public interface OpStrategy {

    boolean execute(String myVal, Object val);

    boolean validate(Object val);
}
