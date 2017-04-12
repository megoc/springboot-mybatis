package com.flymegoc.model;

import java.util.Date;

public class SprUser {
    private Integer sprUserId;

    private String sprUserName;

    private String sprUserPassword;

    private String sprUserEmail;

    private String sprUserPic;

    private Integer sprUserPhone;

    private Integer sprUserAge;

    private Date sprCreateTime;

    private Date sprUpdateTime;

    public Integer getSprUserId() {
        return sprUserId;
    }

    public void setSprUserId(Integer sprUserId) {
        this.sprUserId = sprUserId;
    }

    public String getSprUserName() {
        return sprUserName;
    }

    public void setSprUserName(String sprUserName) {
        this.sprUserName = sprUserName == null ? null : sprUserName.trim();
    }

    public String getSprUserPassword() {
        return sprUserPassword;
    }

    public void setSprUserPassword(String sprUserPassword) {
        this.sprUserPassword = sprUserPassword == null ? null : sprUserPassword.trim();
    }

    public String getSprUserEmail() {
        return sprUserEmail;
    }

    public void setSprUserEmail(String sprUserEmail) {
        this.sprUserEmail = sprUserEmail == null ? null : sprUserEmail.trim();
    }

    public String getSprUserPic() {
        return sprUserPic;
    }

    public void setSprUserPic(String sprUserPic) {
        this.sprUserPic = sprUserPic == null ? null : sprUserPic.trim();
    }

    public Integer getSprUserPhone() {
        return sprUserPhone;
    }

    public void setSprUserPhone(Integer sprUserPhone) {
        this.sprUserPhone = sprUserPhone;
    }

    public Integer getSprUserAge() {
        return sprUserAge;
    }

    public void setSprUserAge(Integer sprUserAge) {
        this.sprUserAge = sprUserAge;
    }

    public Date getSprCreateTime() {
        return sprCreateTime;
    }

    public void setSprCreateTime(Date sprCreateTime) {
        this.sprCreateTime = sprCreateTime;
    }

    public Date getSprUpdateTime() {
        return sprUpdateTime;
    }

    public void setSprUpdateTime(Date sprUpdateTime) {
        this.sprUpdateTime = sprUpdateTime;
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
        SprUser other = (SprUser) that;
        return (this.getSprUserId() == null ? other.getSprUserId() == null : this.getSprUserId().equals(other.getSprUserId()))
            && (this.getSprUserName() == null ? other.getSprUserName() == null : this.getSprUserName().equals(other.getSprUserName()))
            && (this.getSprUserPassword() == null ? other.getSprUserPassword() == null : this.getSprUserPassword().equals(other.getSprUserPassword()))
            && (this.getSprUserEmail() == null ? other.getSprUserEmail() == null : this.getSprUserEmail().equals(other.getSprUserEmail()))
            && (this.getSprUserPic() == null ? other.getSprUserPic() == null : this.getSprUserPic().equals(other.getSprUserPic()))
            && (this.getSprUserPhone() == null ? other.getSprUserPhone() == null : this.getSprUserPhone().equals(other.getSprUserPhone()))
            && (this.getSprUserAge() == null ? other.getSprUserAge() == null : this.getSprUserAge().equals(other.getSprUserAge()))
            && (this.getSprCreateTime() == null ? other.getSprCreateTime() == null : this.getSprCreateTime().equals(other.getSprCreateTime()))
            && (this.getSprUpdateTime() == null ? other.getSprUpdateTime() == null : this.getSprUpdateTime().equals(other.getSprUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSprUserId() == null) ? 0 : getSprUserId().hashCode());
        result = prime * result + ((getSprUserName() == null) ? 0 : getSprUserName().hashCode());
        result = prime * result + ((getSprUserPassword() == null) ? 0 : getSprUserPassword().hashCode());
        result = prime * result + ((getSprUserEmail() == null) ? 0 : getSprUserEmail().hashCode());
        result = prime * result + ((getSprUserPic() == null) ? 0 : getSprUserPic().hashCode());
        result = prime * result + ((getSprUserPhone() == null) ? 0 : getSprUserPhone().hashCode());
        result = prime * result + ((getSprUserAge() == null) ? 0 : getSprUserAge().hashCode());
        result = prime * result + ((getSprCreateTime() == null) ? 0 : getSprCreateTime().hashCode());
        result = prime * result + ((getSprUpdateTime() == null) ? 0 : getSprUpdateTime().hashCode());
        return result;
    }
}