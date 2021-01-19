package com.github.tomasjuan007.policycenter.dal.mapper;

import com.github.tomasjuan007.policycenter.dal.model.TbRuleExample;
import com.github.tomasjuan007.policycenter.vo.nsm.RuleNode;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbRuleExtMapper {
    /**
     * 增加节点左值
     * @param incr 增值
     * @param incrLftExample 条件
     * @return 影响行数
     */
    int incrLftByExample(@Param("incr") long incr, @Param("example") TbRuleExample incrLftExample);

    /**
     * 增加节点右值
     * @param incr 增值
     * @param incrRgtExample 条件
     * @return 影响行数
     */
    int incrRgtByExample(@Param("incr") long incr, @Param("example") TbRuleExample incrRgtExample);

    /**
     * 按前序遍历倒序获取带直接父节点信息的规则叶子节点列表
     * @return RuleNode列表
     */
    List<RuleNode> selectLeafNodesByPreOrderReversal();

    /**
     * 获取带直接父节点信息的规则节点列表
     * @return RuleNode列表
     */
    List<RuleNode> selectNodesWithParentId();

    /**
     * 按后序遍历倒序获取带直接父节点信息的规则节点列表
     * @return RuleNode列表
     */
    List<RuleNode> selectNodesBySubOrderReversal();

    /**
     * 性能测试插入数据（tb_rule.performance.dml.sql）
     * @param ruleId 规则ID
     * @return 影响行数
     */
    int insertPerformanceRecord(@Param("ruleId")Long ruleId);
}
