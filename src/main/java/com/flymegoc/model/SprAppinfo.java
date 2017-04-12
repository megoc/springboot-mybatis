package com.flymegoc.model;

import java.util.Date;

public class SprAppinfo {
    private Integer sprAppinfoId;

    private Float sprAppversion;

    private String sprAppname;

    private Date sprLastupdatetime;

    private String sprUpdateinfo;

    private String sprApkdownloadurl;

    private Date sprCreateTime;

    private Date sprUpdateTime;

    public Integer getSprAppinfoId() {
        return sprAppinfoId;
    }

    public void setSprAppinfoId(Integer sprAppinfoId) {
        this.sprAppinfoId = sprAppinfoId;
    }

    public Float getSprAppversion() {
        return sprAppversion;
    }

    public void setSprAppversion(Float sprAppversion) {
        this.sprAppversion = sprAppversion;
    }

    public String getSprAppname() {
        return sprAppname;
    }

    public void setSprAppname(String sprAppname) {
        this.sprAppname = sprAppname == null ? null : sprAppname.trim();
    }

    public Date getSprLastupdatetime() {
        return sprLastupdatetime;
    }

    public void setSprLastupdatetime(Date sprLastupdatetime) {
        this.sprLastupdatetime = sprLastupdatetime;
    }

    public String getSprUpdateinfo() {
        return sprUpdateinfo;
    }

    public void setSprUpdateinfo(String sprUpdateinfo) {
        this.sprUpdateinfo = sprUpdateinfo == null ? null : sprUpdateinfo.trim();
    }

    public String getSprApkdownloadurl() {
        return sprApkdownloadurl;
    }

    public void setSprApkdownloadurl(String sprApkdownloadurl) {
        this.sprApkdownloadurl = sprApkdownloadurl == null ? null : sprApkdownloadurl.trim();
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
        SprAppinfo other = (SprAppinfo) that;
        return (this.getSprAppinfoId() == null ? other.getSprAppinfoId() == null : this.getSprAppinfoId().equals(other.getSprAppinfoId()))
            && (this.getSprAppversion() == null ? other.getSprAppversion() == null : this.getSprAppversion().equals(other.getSprAppversion()))
            && (this.getSprAppname() == null ? other.getSprAppname() == null : this.getSprAppname().equals(other.getSprAppname()))
            && (this.getSprLastupdatetime() == null ? other.getSprLastupdatetime() == null : this.getSprLastupdatetime().equals(other.getSprLastupdatetime()))
            && (this.getSprUpdateinfo() == null ? other.getSprUpdateinfo() == null : this.getSprUpdateinfo().equals(other.getSprUpdateinfo()))
            && (this.getSprApkdownloadurl() == null ? other.getSprApkdownloadurl() == null : this.getSprApkdownloadurl().equals(other.getSprApkdownloadurl()))
            && (this.getSprCreateTime() == null ? other.getSprCreateTime() == null : this.getSprCreateTime().equals(other.getSprCreateTime()))
            && (this.getSprUpdateTime() == null ? other.getSprUpdateTime() == null : this.getSprUpdateTime().equals(other.getSprUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSprAppinfoId() == null) ? 0 : getSprAppinfoId().hashCode());
        result = prime * result + ((getSprAppversion() == null) ? 0 : getSprAppversion().hashCode());
        result = prime * result + ((getSprAppname() == null) ? 0 : getSprAppname().hashCode());
        result = prime * result + ((getSprLastupdatetime() == null) ? 0 : getSprLastupdatetime().hashCode());
        result = prime * result + ((getSprUpdateinfo() == null) ? 0 : getSprUpdateinfo().hashCode());
        result = prime * result + ((getSprApkdownloadurl() == null) ? 0 : getSprApkdownloadurl().hashCode());
        result = prime * result + ((getSprCreateTime() == null) ? 0 : getSprCreateTime().hashCode());
        result = prime * result + ((getSprUpdateTime() == null) ? 0 : getSprUpdateTime().hashCode());
        return result;
    }
}