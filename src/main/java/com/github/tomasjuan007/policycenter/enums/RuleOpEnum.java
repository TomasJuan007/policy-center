package com.github.tomasjuan007.policycenter.enums;

public enum RuleOpEnum {
    /**
     * 任意值
     */
    ANY("any", "接受任意值"),
    /**
     * 拒绝任意值
     */
    NONE("none", "不接受任意值"),
    /**
     * 等于
     */
    EQUAL_TO("eq", "等同于"),
    /**
     * 不等于
     */
    NOT_EQUAL_TO("neq", "不等同于"),
    /**
     * 包含于
     */
    IN("in", "包含于"),
    /**
     * 不包含于
     */
    NOT_IN("nin", "不包含于"),
    /**
     * 大于
     */
    GREATOR_THAN("gt", "大于"),
    /**
     * 大于等于
     */
    GREATOR_THAN_OR_EQUAL_TO("egt", "大于等于"),
    /**
     * 小于
     */
    LESS_THAN("lt", "小于"),
    /**
     * 小于等于
     */
    LESS_THAN_OR_EQUAL_TO("elt", "小于等于"),
    /**
     * 区间内
     */
    BETWEEN("btw", "在区间内"),
    /**
     * 区间外
     */
    NOT_BETWEEN("nbtw", "在区间外"),
    /**
     * 在白名单里
     */
    BLOB_IN("blob_in", "在白名单里"),
    /**
     * 在黑名单里
     */
    BLOB_NIN("blob_nin", "在黑名单里"),
    ;

    private String op;
    private String desc;

    RuleOpEnum(String op, String desc) {
        this.op = op;
        this.desc = desc;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
