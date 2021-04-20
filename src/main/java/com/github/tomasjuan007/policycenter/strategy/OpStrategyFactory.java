package com.github.tomasjuan007.policycenter.strategy;

import com.github.tomasjuan007.policycenter.enums.RuleOpEnum;
import com.github.tomasjuan007.policycenter.strategy.base.*;
import com.github.tomasjuan007.policycenter.strategy.bitmap.BlobInStrategy;
import com.github.tomasjuan007.policycenter.strategy.bitmap.BlobNinStrategy;
import com.github.tomasjuan007.policycenter.strategy.compare.*;

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
        //普通运算
        map.put(RuleOpEnum.ANY.getOp(), new AnyStrategy());
        map.put(RuleOpEnum.NONE.getOp(), new NoneStrategy());
        map.put(RuleOpEnum.EQUAL_TO.getOp(), new EqStrategy());
        map.put(RuleOpEnum.NOT_EQUAL_TO.getOp(), new NeqStrategy());
        map.put(RuleOpEnum.IN.getOp(), new InStrategy());
        map.put(RuleOpEnum.NOT_IN.getOp(), new NinStrategy());
        //比较运算
        map.put(RuleOpEnum.GREATOR_THAN.getOp(), new GtStrategy());
        map.put(RuleOpEnum.GREATOR_THAN_OR_EQUAL_TO.getOp(), new EgtStrategy());
        map.put(RuleOpEnum.LESS_THAN.getOp(), new LtStrategy());
        map.put(RuleOpEnum.LESS_THAN_OR_EQUAL_TO.getOp(), new EltStrategy());
        map.put(RuleOpEnum.BETWEEN.getOp(), new BtwStrategy());
        map.put(RuleOpEnum.NOT_BETWEEN.getOp(), new NbtwStrategy());
        //位图运算
        map.put(RuleOpEnum.BLOB_IN.getOp(), new BlobInStrategy());
        map.put(RuleOpEnum.BLOB_NIN.getOp(), new BlobNinStrategy());
    }
}
