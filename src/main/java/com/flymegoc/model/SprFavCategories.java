package com.flymegoc.model;

import java.util.Date;

public class SprFavCategories {
    private Integer sprFavCategoriesId;

    private String sprFavCategoriesName;

    private Integer sprFavCategoriesLikes;

    private Integer sprFavCategoriesPrivate;

    private Date sprFavCategoriesCreateTime;

    private Date sprFavCategoriesUpdateTime;

    private Integer sprFavCategoriesUserid;

    public Integer getSprFavCategoriesId() {
        return sprFavCategoriesId;
    }

    public void setSprFavCategoriesId(Integer sprFavCategoriesId) {
        this.sprFavCategoriesId = sprFavCategoriesId;
    }

    public String getSprFavCategoriesName() {
        return sprFavCategoriesName;
    }

    public void setSprFavCategoriesName(String sprFavCategoriesName) {
        this.sprFavCategoriesName = sprFavCategoriesName == null ? null : sprFavCategoriesName.trim();
    }

    public Integer getSprFavCategoriesLikes() {
        return sprFavCategoriesLikes;
    }

    public void setSprFavCategoriesLikes(Integer sprFavCategoriesLikes) {
        this.sprFavCategoriesLikes = sprFavCategoriesLikes;
    }

    public Integer getSprFavCategoriesPrivate() {
        return sprFavCategoriesPrivate;
    }

    public void setSprFavCategoriesPrivate(Integer sprFavCategoriesPrivate) {
        this.sprFavCategoriesPrivate = sprFavCategoriesPrivate;
    }

    public Date getSprFavCategoriesCreateTime() {
        return sprFavCategoriesCreateTime;
    }

    public void setSprFavCategoriesCreateTime(Date sprFavCategoriesCreateTime) {
        this.sprFavCategoriesCreateTime = sprFavCategoriesCreateTime;
    }

    public Date getSprFavCategoriesUpdateTime() {
        return sprFavCategoriesUpdateTime;
    }

    public void setSprFavCategoriesUpdateTime(Date sprFavCategoriesUpdateTime) {
        this.sprFavCategoriesUpdateTime = sprFavCategoriesUpdateTime;
    }

    public Integer getSprFavCategoriesUserid() {
        return sprFavCategoriesUserid;
    }

    public void setSprFavCategoriesUserid(Integer sprFavCategoriesUserid) {
        this.sprFavCategoriesUserid = sprFavCategoriesUserid;
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
        SprFavCategories other = (SprFavCategories) that;
        return (this.getSprFavCategoriesId() == null ? other.getSprFavCategoriesId() == null : this.getSprFavCategoriesId().equals(other.getSprFavCategoriesId()))
            && (this.getSprFavCategoriesName() == null ? other.getSprFavCategoriesName() == null : this.getSprFavCategoriesName().equals(other.getSprFavCategoriesName()))
            && (this.getSprFavCategoriesLikes() == null ? other.getSprFavCategoriesLikes() == null : this.getSprFavCategoriesLikes().equals(other.getSprFavCategoriesLikes()))
            && (this.getSprFavCategoriesPrivate() == null ? other.getSprFavCategoriesPrivate() == null : this.getSprFavCategoriesPrivate().equals(other.getSprFavCategoriesPrivate()))
            && (this.getSprFavCategoriesCreateTime() == null ? other.getSprFavCategoriesCreateTime() == null : this.getSprFavCategoriesCreateTime().equals(other.getSprFavCategoriesCreateTime()))
            && (this.getSprFavCategoriesUpdateTime() == null ? other.getSprFavCategoriesUpdateTime() == null : this.getSprFavCategoriesUpdateTime().equals(other.getSprFavCategoriesUpdateTime()))
            && (this.getSprFavCategoriesUserid() == null ? other.getSprFavCategoriesUserid() == null : this.getSprFavCategoriesUserid().equals(other.getSprFavCategoriesUserid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSprFavCategoriesId() == null) ? 0 : getSprFavCategoriesId().hashCode());
        result = prime * result + ((getSprFavCategoriesName() == null) ? 0 : getSprFavCategoriesName().hashCode());
        result = prime * result + ((getSprFavCategoriesLikes() == null) ? 0 : getSprFavCategoriesLikes().hashCode());
        result = prime * result + ((getSprFavCategoriesPrivate() == null) ? 0 : getSprFavCategoriesPrivate().hashCode());
        result = prime * result + ((getSprFavCategoriesCreateTime() == null) ? 0 : getSprFavCategoriesCreateTime().hashCode());
        result = prime * result + ((getSprFavCategoriesUpdateTime() == null) ? 0 : getSprFavCategoriesUpdateTime().hashCode());
        result = prime * result + ((getSprFavCategoriesUserid() == null) ? 0 : getSprFavCategoriesUserid().hashCode());
        return result;
    }
}