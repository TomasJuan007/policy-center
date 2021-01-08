package com.github.tomasjuan007.policycenter.strategy;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class InStrategy implements OpStrategy {
    @Override
    public boolean execute(String myVal, String val) {
        if (myVal == null) {
            return false;
        }
        List<String> list = JSONObject.parseArray(val, String.class);
        return list.contains(myVal);
    }
}
