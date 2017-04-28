package com.flymegoc.model;

import com.baomidou.mybatisplus.enums.IdType;
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
@TableName("spr_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

	@TableId(value="spr_user_id", type= IdType.AUTO)
	private Integer sprUserId;
	@TableField("spr_user_name")
	private String sprUserName;
	@TableField("spr_user_password")
	private String sprUserPassword;
	@TableField("spr_user_email")
	private String sprUserEmail;
	@TableField("spr_user_pic")
	private String sprUserPic;
	@TableField("spr_user_phone")
	private Integer sprUserPhone;
	@TableField("spr_user_age")
	private Integer sprUserAge;
	@TableField("spr_create_time")
	private Date sprCreateTime;
	@TableField("spr_update_time")
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
		this.sprUserName = sprUserName;
	}

	public String getSprUserPassword() {
		return sprUserPassword;
	}

	public void setSprUserPassword(String sprUserPassword) {
		this.sprUserPassword = sprUserPassword;
	}

	public String getSprUserEmail() {
		return sprUserEmail;
	}

	public void setSprUserEmail(String sprUserEmail) {
		this.sprUserEmail = sprUserEmail;
	}

	public String getSprUserPic() {
		return sprUserPic;
	}

	public void setSprUserPic(String sprUserPic) {
		this.sprUserPic = sprUserPic;
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

	public static final String SPR_USER_ID = "spr_user_id";

	public static final String SPR_USER_NAME = "spr_user_name";

	public static final String SPR_USER_PASSWORD = "spr_user_password";

	public static final String SPR_USER_EMAIL = "spr_user_email";

	public static final String SPR_USER_PIC = "spr_user_pic";

	public static final String SPR_USER_PHONE = "spr_user_phone";

	public static final String SPR_USER_AGE = "spr_user_age";

	public static final String SPR_CREATE_TIME = "spr_create_time";

	public static final String SPR_UPDATE_TIME = "spr_update_time";

	@Override
	protected Serializable pkVal() {
		return this.sprUserId;
	}

}
