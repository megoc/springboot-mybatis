package com.flymegoc.model;

public class SprUserRole {
    private Integer sprUserRoleId;

    private Integer sprUserId;

    private Integer sprRoleId;

    public Integer getSprUserRoleId() {
        return sprUserRoleId;
    }

    public void setSprUserRoleId(Integer sprUserRoleId) {
        this.sprUserRoleId = sprUserRoleId;
    }

    public Integer getSprUserId() {
        return sprUserId;
    }

    public void setSprUserId(Integer sprUserId) {
        this.sprUserId = sprUserId;
    }

    public Integer getSprRoleId() {
        return sprRoleId;
    }

    public void setSprRoleId(Integer sprRoleId) {
        this.sprRoleId = sprRoleId;
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
        SprUserRole other = (SprUserRole) that;
        return (this.getSprUserRoleId() == null ? other.getSprUserRoleId() == null : this.getSprUserRoleId().equals(other.getSprUserRoleId()))
            && (this.getSprUserId() == null ? other.getSprUserId() == null : this.getSprUserId().equals(other.getSprUserId()))
            && (this.getSprRoleId() == null ? other.getSprRoleId() == null : this.getSprRoleId().equals(other.getSprRoleId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSprUserRoleId() == null) ? 0 : getSprUserRoleId().hashCode());
        result = prime * result + ((getSprUserId() == null) ? 0 : getSprUserId().hashCode());
        result = prime * result + ((getSprRoleId() == null) ? 0 : getSprRoleId().hashCode());
        return result;
    }
}