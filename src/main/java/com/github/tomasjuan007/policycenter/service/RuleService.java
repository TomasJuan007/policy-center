package com.github.tomasjuan007.policycenter.service;

public interface RuleService {
    /**
     * 新增规则根节点
     * @param name 规则名称
     * @param val 规则内容
     * @return 规则ID
     */
    Long addRoot(String name, String val);
}
