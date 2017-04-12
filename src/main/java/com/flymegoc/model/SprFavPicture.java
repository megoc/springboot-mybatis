package com.flymegoc.model;

import java.util.Date;

public class SprFavPicture {
    private Integer sprFavPictureId;

    private Integer sprFavPictureUserid;

    private Integer sprFavPictureFavCategoryid;

    private Float sprFavPicturePictureid;

    private Date sprFavPictureCreateTime;

    private Date sprFavPictureUpdateTime;

    public Integer getSprFavPictureId() {
        return sprFavPictureId;
    }

    public void setSprFavPictureId(Integer sprFavPictureId) {
        this.sprFavPictureId = sprFavPictureId;
    }

    public Integer getSprFavPictureUserid() {
        return sprFavPictureUserid;
    }

    public void setSprFavPictureUserid(Integer sprFavPictureUserid) {
        this.sprFavPictureUserid = sprFavPictureUserid;
    }

    public Integer getSprFavPictureFavCategoryid() {
        return sprFavPictureFavCategoryid;
    }

    public void setSprFavPictureFavCategoryid(Integer sprFavPictureFavCategoryid) {
        this.sprFavPictureFavCategoryid = sprFavPictureFavCategoryid;
    }

    public Float getSprFavPicturePictureid() {
        return sprFavPicturePictureid;
    }

    public void setSprFavPicturePictureid(Float sprFavPicturePictureid) {
        this.sprFavPicturePictureid = sprFavPicturePictureid;
    }

    public Date getSprFavPictureCreateTime() {
        return sprFavPictureCreateTime;
    }

    public void setSprFavPictureCreateTime(Date sprFavPictureCreateTime) {
        this.sprFavPictureCreateTime = sprFavPictureCreateTime;
    }

    public Date getSprFavPictureUpdateTime() {
        return sprFavPictureUpdateTime;
    }

    public void setSprFavPictureUpdateTime(Date sprFavPictureUpdateTime) {
        this.sprFavPictureUpdateTime = sprFavPictureUpdateTime;
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
        SprFavPicture other = (SprFavPicture) that;
        return (this.getSprFavPictureId() == null ? other.getSprFavPictureId() == null : this.getSprFavPictureId().equals(other.getSprFavPictureId()))
            && (this.getSprFavPictureUserid() == null ? other.getSprFavPictureUserid() == null : this.getSprFavPictureUserid().equals(other.getSprFavPictureUserid()))
            && (this.getSprFavPictureFavCategoryid() == null ? other.getSprFavPictureFavCategoryid() == null : this.getSprFavPictureFavCategoryid().equals(other.getSprFavPictureFavCategoryid()))
            && (this.getSprFavPicturePictureid() == null ? other.getSprFavPicturePictureid() == null : this.getSprFavPicturePictureid().equals(other.getSprFavPicturePictureid()))
            && (this.getSprFavPictureCreateTime() == null ? other.getSprFavPictureCreateTime() == null : this.getSprFavPictureCreateTime().equals(other.getSprFavPictureCreateTime()))
            && (this.getSprFavPictureUpdateTime() == null ? other.getSprFavPictureUpdateTime() == null : this.getSprFavPictureUpdateTime().equals(other.getSprFavPictureUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSprFavPictureId() == null) ? 0 : getSprFavPictureId().hashCode());
        result = prime * result + ((getSprFavPictureUserid() == null) ? 0 : getSprFavPictureUserid().hashCode());
        result = prime * result + ((getSprFavPictureFavCategoryid() == null) ? 0 : getSprFavPictureFavCategoryid().hashCode());
        result = prime * result + ((getSprFavPicturePictureid() == null) ? 0 : getSprFavPicturePictureid().hashCode());
        result = prime * result + ((getSprFavPictureCreateTime() == null) ? 0 : getSprFavPictureCreateTime().hashCode());
        result = prime * result + ((getSprFavPictureUpdateTime() == null) ? 0 : getSprFavPictureUpdateTime().hashCode());
        return result;
    }
}