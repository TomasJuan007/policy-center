package com.github.tomasjuan007.policycenter.strategy.base;

import com.github.tomasjuan007.policycenter.strategy.OpStrategy;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.List;

public class NinStrategy implements OpStrategy {
    @Override
    public boolean execute(String myVal, Object val) {
        if (!(val instanceof String)) {
            return false;
        }

        if (myVal == null) {
            return false;
        }
        String[] array = ((String) val).split(",");
        List<String> list = Arrays.asList(array);
        return !list.contains(myVal);
    }

    @Override
    public boolean validate(Object val) {
        if (!(val instanceof String)) {
            return false;
        }

        try {
            String[] array = ((String) val).split(",");
            List<String> list = Arrays.asList(array);
            if (CollectionUtils.isNotEmpty(list)) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
}
