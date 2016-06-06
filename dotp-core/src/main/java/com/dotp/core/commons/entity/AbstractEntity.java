package com.dotp.core.commons.entity;

import java.io.Serializable;

/**
 * Created by sherw on 2016/6/6.
 */
public abstract class AbstractEntity implements Serializable {

    private String id;

    private String version;

    public String getId() {
        return id;
    }

    public String getVersion() {
        return version;
    }

    protected void setId(String id) {
        this.id = id;
    }

    protected void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractEntity that = (AbstractEntity) o;

        return id != null ? id.equals(that.id) : that.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
