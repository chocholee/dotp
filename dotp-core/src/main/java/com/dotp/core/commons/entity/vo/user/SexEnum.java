package com.dotp.core.commons.entity.vo.user;

/**
 * Created by sherw on 2016/6/6.
 */
public enum SexEnum {

    ALL( "全部", 0, Boolean.TRUE),
    MALE(  "男", 1, Boolean.FALSE),
    FEMALE("女", 2, Boolean.FALSE);

    private final String    name;

    private final int       value;

    private final boolean   isQuery;

    SexEnum(String name, int value, boolean isQuery) {
        this.name = name;
        this.value = value;
        this.isQuery = isQuery;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public boolean isQuery() {
        return isQuery;
    }

}
