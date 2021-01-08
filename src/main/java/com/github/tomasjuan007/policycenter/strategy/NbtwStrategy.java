package com.github.tomasjuan007.policycenter.strategy;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class NbtwStrategy implements OpStrategy {
    @Override
    public boolean execute(String myVal, String val) {
        if (myVal == null) {
            return false;
        }
        List<Integer> range = JSONObject.parseArray(val, Integer.class);
        return Integer.parseInt(myVal) > range.get(1) && Integer.parseInt(myVal) < range.get(0);
    }
}
