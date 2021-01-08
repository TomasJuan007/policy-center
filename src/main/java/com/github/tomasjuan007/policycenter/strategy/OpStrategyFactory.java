package com.github.tomasjuan007.policycenter.strategy;

import com.github.tomasjuan007.policycenter.enums.RuleOpEnum;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OpStrategyFactory {
    private static Map<String, OpStrategy> map = new HashMap<>(10);
    private static Map<String, OpStrategy> opStrategyMap = Collections.unmodifiableMap(map);


    public static OpStrategy getOpStrategy(String opName) {
        return opStrategyMap.get(opName);
    }

    static {
        map.put(RuleOpEnum.EQUAL_TO.getOp(), new EqStrategy());
        map.put(RuleOpEnum.NOT_EQUAL_TO.getOp(), new NeqStrategy());
        map.put(RuleOpEnum.GREATOR_THAN.getOp(), new GtStrategy());
        map.put(RuleOpEnum.GREATOR_THAN_OR_EQUAL_TO.getOp(), new EgtStrategy());
        map.put(RuleOpEnum.LESS_THAN.getOp(), new LtStrategy());
        map.put(RuleOpEnum.LESS_THAN_OR_EQUAL_TO.getOp(), new EltStrategy());
        map.put(RuleOpEnum.BETWEEN.getOp(), new BtwStrategy());
        map.put(RuleOpEnum.NOT_BETWEEN.getOp(), new NbtwStrategy());
        map.put(RuleOpEnum.IN.getOp(), new InStrategy());
        map.put(RuleOpEnum.NOT_IN.getOp(), new NinStrategy());
        map.put(RuleOpEnum.ANY.getOp(), new AllStrategy());
    }
}
