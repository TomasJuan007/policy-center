package com.github.tomasjuan007.policycenter.service.impl.flow;

import com.github.tomasjuan007.policycenter.dal.model.TbRule;
import com.github.tomasjuan007.policycenter.vo.lane.Conclusion;

import java.util.List;
import java.util.Map;

public interface RuleFlowLaneService {
    /**
     * 注入规则
     * @param ruleList 规则列表
     */
    void setRuleList(List<TbRule> ruleList);
    /**
     * 查询匹配的规则
     * @param facts 事实数据
     * @return 匹配结果
     */
    Conclusion getConclusion(Map<String, String> facts);
}
