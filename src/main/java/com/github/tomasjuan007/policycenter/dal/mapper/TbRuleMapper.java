package com.github.tomasjuan007.policycenter.dal.mapper;

import com.github.tomasjuan007.policycenter.dal.model.TbRule;
import com.github.tomasjuan007.policycenter.dal.model.TbRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    long countByExample(TbRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    int deleteByExample(TbRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    int insert(TbRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    int insertSelective(TbRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    List<TbRule> selectByExample(TbRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    TbRule selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    int updateByExampleSelective(@Param("record") TbRule record, @Param("example") TbRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    int updateByExample(@Param("record") TbRule record, @Param("example") TbRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    int updateByPrimaryKeySelective(TbRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    int updateByPrimaryKey(TbRule record);

    /**
     * 增加节点左值
     * @param incr 增值
     * @param incrLftExample 条件
     * @return 影响行数
     */
    int incrLftByExample(@Param("incr") int incr, @Param("example") TbRuleExample incrLftExample);

    /**
     * 增加节点右值
     * @param incr 增值
     * @param incrRgtExample 条件
     * @return 影响行数
     */
    int incrRgtByExample(@Param("incr") int incr, @Param("example") TbRuleExample incrRgtExample);
}