package com.flymegoc.model;

import java.util.Date;

public class SprPicture {
    private Float sprPictureId;

    private String sprPicturePinid;

    private String sprPictureBoardid;

    private String sprPictureBucket;

    private String sprPictureKey;

    private String sprPictureType;

    private Integer sprPictureWidth;

    private Integer sprPictureHeight;

    private Double sprPictureRatio;

    private Integer sprPictureReads;

    private Integer sprPictureLikes;

    private Integer sprPictureCategoryid;

    private Date sprPictureCreateTime;

    private Date sprPictureUpdateTime;

    public Float getSprPictureId() {
        return sprPictureId;
    }

    public void setSprPictureId(Float sprPictureId) {
        this.sprPictureId = sprPictureId;
    }

    public String getSprPicturePinid() {
        return sprPicturePinid;
    }

    public void setSprPicturePinid(String sprPicturePinid) {
        this.sprPicturePinid = sprPicturePinid == null ? null : sprPicturePinid.trim();
    }

    public String getSprPictureBoardid() {
        return sprPictureBoardid;
    }

    public void setSprPictureBoardid(String sprPictureBoardid) {
        this.sprPictureBoardid = sprPictureBoardid == null ? null : sprPictureBoardid.trim();
    }

    public String getSprPictureBucket() {
        return sprPictureBucket;
    }

    public void setSprPictureBucket(String sprPictureBucket) {
        this.sprPictureBucket = sprPictureBucket == null ? null : sprPictureBucket.trim();
    }

    public String getSprPictureKey() {
        return sprPictureKey;
    }

    public void setSprPictureKey(String sprPictureKey) {
        this.sprPictureKey = sprPictureKey == null ? null : sprPictureKey.trim();
    }

    public String getSprPictureType() {
        return sprPictureType;
    }

    public void setSprPictureType(String sprPictureType) {
        this.sprPictureType = sprPictureType == null ? null : sprPictureType.trim();
    }

    public Integer getSprPictureWidth() {
        return sprPictureWidth;
    }

    public void setSprPictureWidth(Integer sprPictureWidth) {
        this.sprPictureWidth = sprPictureWidth;
    }

    public Integer getSprPictureHeight() {
        return sprPictureHeight;
    }

    public void setSprPictureHeight(Integer sprPictureHeight) {
        this.sprPictureHeight = sprPictureHeight;
    }

    public Double getSprPictureRatio() {
        return sprPictureRatio;
    }

    public void setSprPictureRatio(Double sprPictureRatio) {
        this.sprPictureRatio = sprPictureRatio;
    }

    public Integer getSprPictureReads() {
        return sprPictureReads;
    }

    public void setSprPictureReads(Integer sprPictureReads) {
        this.sprPictureReads = sprPictureReads;
    }

    public Integer getSprPictureLikes() {
        return sprPictureLikes;
    }

    public void setSprPictureLikes(Integer sprPictureLikes) {
        this.sprPictureLikes = sprPictureLikes;
    }

    public Integer getSprPictureCategoryid() {
        return sprPictureCategoryid;
    }

    public void setSprPictureCategoryid(Integer sprPictureCategoryid) {
        this.sprPictureCategoryid = sprPictureCategoryid;
    }

    public Date getSprPictureCreateTime() {
        return sprPictureCreateTime;
    }

    public void setSprPictureCreateTime(Date sprPictureCreateTime) {
        this.sprPictureCreateTime = sprPictureCreateTime;
    }

    public Date getSprPictureUpdateTime() {
        return sprPictureUpdateTime;
    }

    public void setSprPictureUpdateTime(Date sprPictureUpdateTime) {
        this.sprPictureUpdateTime = sprPictureUpdateTime;
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
        SprPicture other = (SprPicture) that;
        return (this.getSprPictureId() == null ? other.getSprPictureId() == null : this.getSprPictureId().equals(other.getSprPictureId()))
            && (this.getSprPicturePinid() == null ? other.getSprPicturePinid() == null : this.getSprPicturePinid().equals(other.getSprPicturePinid()))
            && (this.getSprPictureBoardid() == null ? other.getSprPictureBoardid() == null : this.getSprPictureBoardid().equals(other.getSprPictureBoardid()))
            && (this.getSprPictureBucket() == null ? other.getSprPictureBucket() == null : this.getSprPictureBucket().equals(other.getSprPictureBucket()))
            && (this.getSprPictureKey() == null ? other.getSprPictureKey() == null : this.getSprPictureKey().equals(other.getSprPictureKey()))
            && (this.getSprPictureType() == null ? other.getSprPictureType() == null : this.getSprPictureType().equals(other.getSprPictureType()))
            && (this.getSprPictureWidth() == null ? other.getSprPictureWidth() == null : this.getSprPictureWidth().equals(other.getSprPictureWidth()))
            && (this.getSprPictureHeight() == null ? other.getSprPictureHeight() == null : this.getSprPictureHeight().equals(other.getSprPictureHeight()))
            && (this.getSprPictureRatio() == null ? other.getSprPictureRatio() == null : this.getSprPictureRatio().equals(other.getSprPictureRatio()))
            && (this.getSprPictureReads() == null ? other.getSprPictureReads() == null : this.getSprPictureReads().equals(other.getSprPictureReads()))
            && (this.getSprPictureLikes() == null ? other.getSprPictureLikes() == null : this.getSprPictureLikes().equals(other.getSprPictureLikes()))
            && (this.getSprPictureCategoryid() == null ? other.getSprPictureCategoryid() == null : this.getSprPictureCategoryid().equals(other.getSprPictureCategoryid()))
            && (this.getSprPictureCreateTime() == null ? other.getSprPictureCreateTime() == null : this.getSprPictureCreateTime().equals(other.getSprPictureCreateTime()))
            && (this.getSprPictureUpdateTime() == null ? other.getSprPictureUpdateTime() == null : this.getSprPictureUpdateTime().equals(other.getSprPictureUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSprPictureId() == null) ? 0 : getSprPictureId().hashCode());
        result = prime * result + ((getSprPicturePinid() == null) ? 0 : getSprPicturePinid().hashCode());
        result = prime * result + ((getSprPictureBoardid() == null) ? 0 : getSprPictureBoardid().hashCode());
        result = prime * result + ((getSprPictureBucket() == null) ? 0 : getSprPictureBucket().hashCode());
        result = prime * result + ((getSprPictureKey() == null) ? 0 : getSprPictureKey().hashCode());
        result = prime * result + ((getSprPictureType() == null) ? 0 : getSprPictureType().hashCode());
        result = prime * result + ((getSprPictureWidth() == null) ? 0 : getSprPictureWidth().hashCode());
        result = prime * result + ((getSprPictureHeight() == null) ? 0 : getSprPictureHeight().hashCode());
        result = prime * result + ((getSprPictureRatio() == null) ? 0 : getSprPictureRatio().hashCode());
        result = prime * result + ((getSprPictureReads() == null) ? 0 : getSprPictureReads().hashCode());
        result = prime * result + ((getSprPictureLikes() == null) ? 0 : getSprPictureLikes().hashCode());
        result = prime * result + ((getSprPictureCategoryid() == null) ? 0 : getSprPictureCategoryid().hashCode());
        result = prime * result + ((getSprPictureCreateTime() == null) ? 0 : getSprPictureCreateTime().hashCode());
        result = prime * result + ((getSprPictureUpdateTime() == null) ? 0 : getSprPictureUpdateTime().hashCode());
        return result;
    }
}