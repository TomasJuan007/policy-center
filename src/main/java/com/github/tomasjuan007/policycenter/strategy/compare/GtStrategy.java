package com.github.tomasjuan007.policycenter.strategy.compare;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class GtStrategy extends AbstractComparableOpStrategy {
    @Override
    public boolean execute(String myVal, Object val) {
        if (!(val instanceof String)) {
            return false;
        }

        if (StringUtils.isEmpty(myVal) || StringUtils.isEmpty((String) val)) {
            return false;
        }

        List<String> originList = new ArrayList<>();
        originList.add(myVal);
        originList.add((String) val);

        List<Double> evalList = evalList(originList);
        if (evalList.size()!=2) {
            return false;
        }

        return evalList.get(0) > evalList.get(1);
    }
}
