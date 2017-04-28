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
@TableName("spr_appinfo")
public class Appinfo extends Model<Appinfo> {

    private static final long serialVersionUID = 1L;

	@TableId(value="spr_appinfo_id", type= IdType.AUTO)
	private Integer sprAppinfoId;
	@TableField("spr_appversion")
	private Float sprAppversion;
	@TableField("spr_appname")
	private String sprAppname;
	@TableField("spr_lastupdatetime")
	private Date sprLastupdatetime;
	@TableField("spr_updateinfo")
	private String sprUpdateinfo;
	@TableField("spr_apkdownloadurl")
	private String sprApkdownloadurl;
	@TableField("spr_create_time")
	private Date sprCreateTime;
	@TableField("spr_update_time")
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
		this.sprAppname = sprAppname;
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
		this.sprUpdateinfo = sprUpdateinfo;
	}

	public String getSprApkdownloadurl() {
		return sprApkdownloadurl;
	}

	public void setSprApkdownloadurl(String sprApkdownloadurl) {
		this.sprApkdownloadurl = sprApkdownloadurl;
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

	public static final String SPR_APPINFO_ID = "spr_appinfo_id";

	public static final String SPR_APPVERSION = "spr_appversion";

	public static final String SPR_APPNAME = "spr_appname";

	public static final String SPR_LASTUPDATETIME = "spr_lastupdatetime";

	public static final String SPR_UPDATEINFO = "spr_updateinfo";

	public static final String SPR_APKDOWNLOADURL = "spr_apkdownloadurl";

	public static final String SPR_CREATE_TIME = "spr_create_time";

	public static final String SPR_UPDATE_TIME = "spr_update_time";

	@Override
	protected Serializable pkVal() {
		return this.sprAppinfoId;
	}

}
