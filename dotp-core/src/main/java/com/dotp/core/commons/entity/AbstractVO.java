package com.dotp.core.commons.entity;

import java.io.Serializable;

/**
 * Created by sherw on 2016/6/6.
 */
public class AbstractVO implements Serializable {

    private String id;

    public AbstractVO() {
    }

    public AbstractVO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

}
