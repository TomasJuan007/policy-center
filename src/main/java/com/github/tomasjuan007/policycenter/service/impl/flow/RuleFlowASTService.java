package com.github.tomasjuan007.policycenter.service.impl.flow;


import java.util.List;
import java.util.Map;

public interface RuleFlowASTService {
    /**
     * 查询匹配的规则-基于AST
     * @param facts 事实数据
     * @return 匹配结果
     */
    List<Long> getHitRuleIds(Map<String, String> facts);
}
