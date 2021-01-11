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

    /**
     * 在某个节点下新增子节点
     * @param pid 父节点的数据库主键ID
     * @param name 规则名称
     * @param val 规则内容
     * @param op 关系运算符
     * @return 节点主键ID
     */
    Long addChild(Long pid, String name, String val, String op);

    /**
     * 获取规则根节点列表
     * @param app 规则来源
     * @return 根节点列表
     */
    List<TbRule> getRootNodes(String app);

    /**
     * 获取某个节点的子节点列表
     * @param id 数据库主键ID
     * @return 子节点列表
     */
    List<TbRule> getChildNodes(Long id);

    /**
     * 修改某个节点的属性
     * @param id 数据库主键ID
     * @param name 节目名称
     * @param val 节点内容
     * @param op 关系运算符
     * @return 数据库主键ID
     */
    Long editNode(Long id, String name, String val, String op);

    /**
     * 删除某个节点
     * @param id 数据库主键ID
     * @param safe 是否安全删除
     * @return 规则ID
     */
    Long deleteNode(Long id, boolean safe) throws Exception;
}
