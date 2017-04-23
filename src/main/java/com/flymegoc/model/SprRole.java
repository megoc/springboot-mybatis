package com.flymegoc.model;

public class SprRole {
    private Integer sprRoleId;

    private String sprRoleName;

    public Integer getSprRoleId() {
        return sprRoleId;
    }

    public void setSprRoleId(Integer sprRoleId) {
        this.sprRoleId = sprRoleId;
    }

    public String getSprRoleName() {
        return sprRoleName;
    }

    public void setSprRoleName(String sprRoleName) {
        this.sprRoleName = sprRoleName == null ? null : sprRoleName.trim();
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
        SprRole other = (SprRole) that;
        return (this.getSprRoleId() == null ? other.getSprRoleId() == null : this.getSprRoleId().equals(other.getSprRoleId()))
            && (this.getSprRoleName() == null ? other.getSprRoleName() == null : this.getSprRoleName().equals(other.getSprRoleName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSprRoleId() == null) ? 0 : getSprRoleId().hashCode());
        result = prime * result + ((getSprRoleName() == null) ? 0 : getSprRoleName().hashCode());
        return result;
    }
}