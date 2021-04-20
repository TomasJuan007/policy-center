package com.github.tomasjuan007.policycenter.strategy.compare;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BtwStrategy extends AbstractComparableOpStrategy {
    @Override
    public boolean execute(String myVal, Object val) {
        if (!(val instanceof String)) {
            return false;
        }

        if (StringUtils.isEmpty(myVal) || StringUtils.isEmpty((String) val)) {
            return false;
        }

        String[] bounds = ((String) val).split(",");

        List<String> originList = new ArrayList<>();
        originList.add(myVal);
        originList.addAll(Arrays.asList(bounds));

        List<Double> evalList = evalList(originList);
        if (evalList.size()!=3) {
            return false;
        }

        return evalList.get(0) >= evalList.get(1) && evalList.get(0) <= evalList.get(2);
    }

    @Override
    public boolean validate(Object val) {
        if (!(val instanceof String)) {
            return false;
        }

        String[] bounds = ((String) val).split(",");
        if (bounds.length!=2) {
            return false;
        }
        return super.validate(bounds[0]) && super.validate(bounds[1]) && super.eval(bounds[0]) <= super.eval(bounds[1]);
    }
}
