package com.flymegoc.model;

public class SprPermission {
    private Integer sprPermissionId;

    private String sprPermissionName;

    private Integer sprRoleId;

    public Integer getSprPermissionId() {
        return sprPermissionId;
    }

    public void setSprPermissionId(Integer sprPermissionId) {
        this.sprPermissionId = sprPermissionId;
    }

    public String getSprPermissionName() {
        return sprPermissionName;
    }

    public void setSprPermissionName(String sprPermissionName) {
        this.sprPermissionName = sprPermissionName == null ? null : sprPermissionName.trim();
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
        SprPermission other = (SprPermission) that;
        return (this.getSprPermissionId() == null ? other.getSprPermissionId() == null : this.getSprPermissionId().equals(other.getSprPermissionId()))
            && (this.getSprPermissionName() == null ? other.getSprPermissionName() == null : this.getSprPermissionName().equals(other.getSprPermissionName()))
            && (this.getSprRoleId() == null ? other.getSprRoleId() == null : this.getSprRoleId().equals(other.getSprRoleId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSprPermissionId() == null) ? 0 : getSprPermissionId().hashCode());
        result = prime * result + ((getSprPermissionName() == null) ? 0 : getSprPermissionName().hashCode());
        result = prime * result + ((getSprRoleId() == null) ? 0 : getSprRoleId().hashCode());
        return result;
    }
}