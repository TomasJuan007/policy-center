package com.github.tomasjuan007.policycenter.service.impl.flow;

import com.github.tomasjuan007.policycenter.vo.lane.Conclusion;

import java.util.Map;

public interface RuleFlowLaneService {
    /**
     * 查询匹配的规则
     * @param facts 事实数据
     * @return 匹配结果
     */
    Conclusion getConclusion(Map<String, String> facts);
}
