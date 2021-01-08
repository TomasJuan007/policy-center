package com.github.tomasjuan007.policycenter.service;

import com.github.tomasjuan007.policycenter.dal.model.TbRule;

import java.util.List;

public interface RuleService {
    /**
     * 获取所有的规则和模式，按前序遍历的倒序排列
     * @return 规则和模式列表
     */
    List<TbRule> getRuleListByPreOrderReversal();

    /**
     * 新增规则根节点
     * @param name 规则名称
     * @param val 规则内容
     * @return 规则ID
     */
    Long addRoot(String name, String val);
}
