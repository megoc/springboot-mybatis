package com.flymegoc.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author FlyMegoc
 * @since 2017-04-28
 */
@TableName("spr_permission")
public class Permission extends Model<Permission> {

    private static final long serialVersionUID = 1L;

    @TableId("spr_permission_id")
	private Integer sprPermissionId;
	@TableField("spr_permission_name")
	private String sprPermissionName;
	@TableField("spr_role_id")
	private Integer sprRoleId;
	@TableField("spr_create_time")
	private Date sprCreateTime;
	@TableField("spr_update_time")
	private Date sprUpdateTime;


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
		this.sprPermissionName = sprPermissionName;
	}

	public Integer getSprRoleId() {
		return sprRoleId;
	}

	public void setSprRoleId(Integer sprRoleId) {
		this.sprRoleId = sprRoleId;
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

	public static final String SPR_PERMISSION_ID = "spr_permission_id";

	public static final String SPR_PERMISSION_NAME = "spr_permission_name";

	public static final String SPR_ROLE_ID = "spr_role_id";

	public static final String SPR_CREATE_TIME = "spr_create_time";

	public static final String SPR_UPDATE_TIME = "spr_update_time";

	@Override
	protected Serializable pkVal() {
		return this.sprPermissionId;
	}

}
