package com.github.tomasjuan007.policycenter.dal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbRuleExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    public TbRuleExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNull() {
            addCriterion("rule_id is null");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNotNull() {
            addCriterion("rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andRuleIdEqualTo(Long value) {
            addCriterion("rule_id =", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotEqualTo(Long value) {
            addCriterion("rule_id <>", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThan(Long value) {
            addCriterion("rule_id >", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rule_id >=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThan(Long value) {
            addCriterion("rule_id <", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThanOrEqualTo(Long value) {
            addCriterion("rule_id <=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdIn(List<Long> values) {
            addCriterion("rule_id in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotIn(List<Long> values) {
            addCriterion("rule_id not in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdBetween(Long value1, Long value2) {
            addCriterion("rule_id between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotBetween(Long value1, Long value2) {
            addCriterion("rule_id not between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andAppIsNull() {
            addCriterion("app is null");
            return (Criteria) this;
        }

        public Criteria andAppIsNotNull() {
            addCriterion("app is not null");
            return (Criteria) this;
        }

        public Criteria andAppEqualTo(String value) {
            addCriterion("app =", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotEqualTo(String value) {
            addCriterion("app <>", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppGreaterThan(String value) {
            addCriterion("app >", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppGreaterThanOrEqualTo(String value) {
            addCriterion("app >=", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppLessThan(String value) {
            addCriterion("app <", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppLessThanOrEqualTo(String value) {
            addCriterion("app <=", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppLike(String value) {
            addCriterion("app like", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotLike(String value) {
            addCriterion("app not like", value, "app");
            return (Criteria) this;
        }

        public Criteria andAppIn(List<String> values) {
            addCriterion("app in", values, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotIn(List<String> values) {
            addCriterion("app not in", values, "app");
            return (Criteria) this;
        }

        public Criteria andAppBetween(String value1, String value2) {
            addCriterion("app between", value1, value2, "app");
            return (Criteria) this;
        }

        public Criteria andAppNotBetween(String value1, String value2) {
            addCriterion("app not between", value1, value2, "app");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andValIsNull() {
            addCriterion("val is null");
            return (Criteria) this;
        }

        public Criteria andValIsNotNull() {
            addCriterion("val is not null");
            return (Criteria) this;
        }

        public Criteria andValEqualTo(String value) {
            addCriterion("val =", value, "val");
            return (Criteria) this;
        }

        public Criteria andValNotEqualTo(String value) {
            addCriterion("val <>", value, "val");
            return (Criteria) this;
        }

        public Criteria andValGreaterThan(String value) {
            addCriterion("val >", value, "val");
            return (Criteria) this;
        }

        public Criteria andValGreaterThanOrEqualTo(String value) {
            addCriterion("val >=", value, "val");
            return (Criteria) this;
        }

        public Criteria andValLessThan(String value) {
            addCriterion("val <", value, "val");
            return (Criteria) this;
        }

        public Criteria andValLessThanOrEqualTo(String value) {
            addCriterion("val <=", value, "val");
            return (Criteria) this;
        }

        public Criteria andValLike(String value) {
            addCriterion("val like", value, "val");
            return (Criteria) this;
        }

        public Criteria andValNotLike(String value) {
            addCriterion("val not like", value, "val");
            return (Criteria) this;
        }

        public Criteria andValIn(List<String> values) {
            addCriterion("val in", values, "val");
            return (Criteria) this;
        }

        public Criteria andValNotIn(List<String> values) {
            addCriterion("val not in", values, "val");
            return (Criteria) this;
        }

        public Criteria andValBetween(String value1, String value2) {
            addCriterion("val between", value1, value2, "val");
            return (Criteria) this;
        }

        public Criteria andValNotBetween(String value1, String value2) {
            addCriterion("val not between", value1, value2, "val");
            return (Criteria) this;
        }

        public Criteria andOpIsNull() {
            addCriterion("op is null");
            return (Criteria) this;
        }

        public Criteria andOpIsNotNull() {
            addCriterion("op is not null");
            return (Criteria) this;
        }

        public Criteria andOpEqualTo(String value) {
            addCriterion("op =", value, "op");
            return (Criteria) this;
        }

        public Criteria andOpNotEqualTo(String value) {
            addCriterion("op <>", value, "op");
            return (Criteria) this;
        }

        public Criteria andOpGreaterThan(String value) {
            addCriterion("op >", value, "op");
            return (Criteria) this;
        }

        public Criteria andOpGreaterThanOrEqualTo(String value) {
            addCriterion("op >=", value, "op");
            return (Criteria) this;
        }

        public Criteria andOpLessThan(String value) {
            addCriterion("op <", value, "op");
            return (Criteria) this;
        }

        public Criteria andOpLessThanOrEqualTo(String value) {
            addCriterion("op <=", value, "op");
            return (Criteria) this;
        }

        public Criteria andOpLike(String value) {
            addCriterion("op like", value, "op");
            return (Criteria) this;
        }

        public Criteria andOpNotLike(String value) {
            addCriterion("op not like", value, "op");
            return (Criteria) this;
        }

        public Criteria andOpIn(List<String> values) {
            addCriterion("op in", values, "op");
            return (Criteria) this;
        }

        public Criteria andOpNotIn(List<String> values) {
            addCriterion("op not in", values, "op");
            return (Criteria) this;
        }

        public Criteria andOpBetween(String value1, String value2) {
            addCriterion("op between", value1, value2, "op");
            return (Criteria) this;
        }

        public Criteria andOpNotBetween(String value1, String value2) {
            addCriterion("op not between", value1, value2, "op");
            return (Criteria) this;
        }

        public Criteria andLftIsNull() {
            addCriterion("lft is null");
            return (Criteria) this;
        }

        public Criteria andLftIsNotNull() {
            addCriterion("lft is not null");
            return (Criteria) this;
        }

        public Criteria andLftEqualTo(Long value) {
            addCriterion("lft =", value, "lft");
            return (Criteria) this;
        }

        public Criteria andLftNotEqualTo(Long value) {
            addCriterion("lft <>", value, "lft");
            return (Criteria) this;
        }

        public Criteria andLftGreaterThan(Long value) {
            addCriterion("lft >", value, "lft");
            return (Criteria) this;
        }

        public Criteria andLftGreaterThanOrEqualTo(Long value) {
            addCriterion("lft >=", value, "lft");
            return (Criteria) this;
        }

        public Criteria andLftLessThan(Long value) {
            addCriterion("lft <", value, "lft");
            return (Criteria) this;
        }

        public Criteria andLftLessThanOrEqualTo(Long value) {
            addCriterion("lft <=", value, "lft");
            return (Criteria) this;
        }

        public Criteria andLftIn(List<Long> values) {
            addCriterion("lft in", values, "lft");
            return (Criteria) this;
        }

        public Criteria andLftNotIn(List<Long> values) {
            addCriterion("lft not in", values, "lft");
            return (Criteria) this;
        }

        public Criteria andLftBetween(Long value1, Long value2) {
            addCriterion("lft between", value1, value2, "lft");
            return (Criteria) this;
        }

        public Criteria andLftNotBetween(Long value1, Long value2) {
            addCriterion("lft not between", value1, value2, "lft");
            return (Criteria) this;
        }

        public Criteria andRgtIsNull() {
            addCriterion("rgt is null");
            return (Criteria) this;
        }

        public Criteria andRgtIsNotNull() {
            addCriterion("rgt is not null");
            return (Criteria) this;
        }

        public Criteria andRgtEqualTo(Long value) {
            addCriterion("rgt =", value, "rgt");
            return (Criteria) this;
        }

        public Criteria andRgtNotEqualTo(Long value) {
            addCriterion("rgt <>", value, "rgt");
            return (Criteria) this;
        }

        public Criteria andRgtGreaterThan(Long value) {
            addCriterion("rgt >", value, "rgt");
            return (Criteria) this;
        }

        public Criteria andRgtGreaterThanOrEqualTo(Long value) {
            addCriterion("rgt >=", value, "rgt");
            return (Criteria) this;
        }

        public Criteria andRgtLessThan(Long value) {
            addCriterion("rgt <", value, "rgt");
            return (Criteria) this;
        }

        public Criteria andRgtLessThanOrEqualTo(Long value) {
            addCriterion("rgt <=", value, "rgt");
            return (Criteria) this;
        }

        public Criteria andRgtIn(List<Long> values) {
            addCriterion("rgt in", values, "rgt");
            return (Criteria) this;
        }

        public Criteria andRgtNotIn(List<Long> values) {
            addCriterion("rgt not in", values, "rgt");
            return (Criteria) this;
        }

        public Criteria andRgtBetween(Long value1, Long value2) {
            addCriterion("rgt between", value1, value2, "rgt");
            return (Criteria) this;
        }

        public Criteria andRgtNotBetween(Long value1, Long value2) {
            addCriterion("rgt not between", value1, value2, "rgt");
            return (Criteria) this;
        }

        public Criteria andLvlIsNull() {
            addCriterion("lvl is null");
            return (Criteria) this;
        }

        public Criteria andLvlIsNotNull() {
            addCriterion("lvl is not null");
            return (Criteria) this;
        }

        public Criteria andLvlEqualTo(Long value) {
            addCriterion("lvl =", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlNotEqualTo(Long value) {
            addCriterion("lvl <>", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlGreaterThan(Long value) {
            addCriterion("lvl >", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlGreaterThanOrEqualTo(Long value) {
            addCriterion("lvl >=", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlLessThan(Long value) {
            addCriterion("lvl <", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlLessThanOrEqualTo(Long value) {
            addCriterion("lvl <=", value, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlIn(List<Long> values) {
            addCriterion("lvl in", values, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlNotIn(List<Long> values) {
            addCriterion("lvl not in", values, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlBetween(Long value1, Long value2) {
            addCriterion("lvl between", value1, value2, "lvl");
            return (Criteria) this;
        }

        public Criteria andLvlNotBetween(Long value1, Long value2) {
            addCriterion("lvl not between", value1, value2, "lvl");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Integer value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Integer value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Integer value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Integer value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Integer> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Integer> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_rule
     *
     * @mbg.generated do_not_delete_during_merge Thu Jan 07 21:15:39 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_rule
     *
     * @mbg.generated Thu Jan 07 21:15:39 CST 2021
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}