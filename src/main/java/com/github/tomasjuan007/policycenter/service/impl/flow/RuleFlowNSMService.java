package com.github.tomasjuan007.policycenter.service.impl.flow;


import java.util.List;
import java.util.Map;

public interface RuleFlowNSMService {
    /**
     * 查询匹配的规则-不同分支或关系
     * @param facts 事实数据
     * @return 匹配结果
     */
    List<Long> getHitRuleIdsORMode(Map<String, String> facts);
    /**
     * 查询匹配的规则-不同分支与关系
     * @param facts 事实数据
     * @return 匹配结果
     */
    List<Long> getHitRuleIdsANDMode(Map<String, String> facts);
}
