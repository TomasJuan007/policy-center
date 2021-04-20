package com.github.tomasjuan007.policycenter.strategy.base;

import com.github.tomasjuan007.policycenter.strategy.OpStrategy;
import org.apache.commons.lang3.StringUtils;

public class NeqStrategy implements OpStrategy {
    @Override
    public boolean execute(String myVal, Object val) {
        if (!(val instanceof String)) {
            return false;
        }

        if (myVal == null) {
            return false;
        }
        return !myVal.equals(val);
    }

    @Override
    public boolean validate(Object val) {
        if (!(val instanceof String)) {
            return false;
        }
        return StringUtils.isNotBlank((String) val);
    }
}
