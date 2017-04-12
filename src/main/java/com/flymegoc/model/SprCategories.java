package com.flymegoc.model;

import java.util.Date;

public class SprCategories {
    private Integer sprCategoryId;

    private String sprCategoryName;

    private String sprCategoryUrl;

    private Date sprCategotyCreateTime;

    private Date sprCategoryUpdateTime;

    private Integer sprCategoryStatus;

    public Integer getSprCategoryId() {
        return sprCategoryId;
    }

    public void setSprCategoryId(Integer sprCategoryId) {
        this.sprCategoryId = sprCategoryId;
    }

    public String getSprCategoryName() {
        return sprCategoryName;
    }

    public void setSprCategoryName(String sprCategoryName) {
        this.sprCategoryName = sprCategoryName == null ? null : sprCategoryName.trim();
    }

    public String getSprCategoryUrl() {
        return sprCategoryUrl;
    }

    public void setSprCategoryUrl(String sprCategoryUrl) {
        this.sprCategoryUrl = sprCategoryUrl == null ? null : sprCategoryUrl.trim();
    }

    public Date getSprCategotyCreateTime() {
        return sprCategotyCreateTime;
    }

    public void setSprCategotyCreateTime(Date sprCategotyCreateTime) {
        this.sprCategotyCreateTime = sprCategotyCreateTime;
    }

    public Date getSprCategoryUpdateTime() {
        return sprCategoryUpdateTime;
    }

    public void setSprCategoryUpdateTime(Date sprCategoryUpdateTime) {
        this.sprCategoryUpdateTime = sprCategoryUpdateTime;
    }

    public Integer getSprCategoryStatus() {
        return sprCategoryStatus;
    }

    public void setSprCategoryStatus(Integer sprCategoryStatus) {
        this.sprCategoryStatus = sprCategoryStatus;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SprCategories other = (SprCategories) that;
        return (this.getSprCategoryId() == null ? other.getSprCategoryId() == null : this.getSprCategoryId().equals(other.getSprCategoryId()))
            && (this.getSprCategoryName() == null ? other.getSprCategoryName() == null : this.getSprCategoryName().equals(other.getSprCategoryName()))
            && (this.getSprCategoryUrl() == null ? other.getSprCategoryUrl() == null : this.getSprCategoryUrl().equals(other.getSprCategoryUrl()))
            && (this.getSprCategotyCreateTime() == null ? other.getSprCategotyCreateTime() == null : this.getSprCategotyCreateTime().equals(other.getSprCategotyCreateTime()))
            && (this.getSprCategoryUpdateTime() == null ? other.getSprCategoryUpdateTime() == null : this.getSprCategoryUpdateTime().equals(other.getSprCategoryUpdateTime()))
            && (this.getSprCategoryStatus() == null ? other.getSprCategoryStatus() == null : this.getSprCategoryStatus().equals(other.getSprCategoryStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSprCategoryId() == null) ? 0 : getSprCategoryId().hashCode());
        result = prime * result + ((getSprCategoryName() == null) ? 0 : getSprCategoryName().hashCode());
        result = prime * result + ((getSprCategoryUrl() == null) ? 0 : getSprCategoryUrl().hashCode());
        result = prime * result + ((getSprCategotyCreateTime() == null) ? 0 : getSprCategotyCreateTime().hashCode());
        result = prime * result + ((getSprCategoryUpdateTime() == null) ? 0 : getSprCategoryUpdateTime().hashCode());
        result = prime * result + ((getSprCategoryStatus() == null) ? 0 : getSprCategoryStatus().hashCode());
        return result;
    }
}