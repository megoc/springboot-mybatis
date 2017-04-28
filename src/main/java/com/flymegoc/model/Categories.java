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
@TableName("spr_categories")
public class Categories extends Model<Categories> {

    private static final long serialVersionUID = 1L;

    @TableId("spr_category_id")
	private Integer sprCategoryId;
	@TableField("spr_category_name")
	private String sprCategoryName;
	@TableField("spr_category_url")
	private String sprCategoryUrl;
	@TableField("spr_categoty_create_time")
	private Date sprCategotyCreateTime;
	@TableField("spr_category_update_time")
	private Date sprCategoryUpdateTime;
	@TableField("spr_category_status")
	private Integer sprCategoryStatus;


	public Integer getSprCategoryId() {
		return sprCategoryId;
	}

	public void setSprCategoryId(Integer sprCategoryId) {
		this.sprCategoryId = sprCategoryId;
	}

	public String getSprCategoryName() {
		return sprCategoryName;
	}

	public void setSprCategoryName(String sprCategoryName) {
		this.sprCategoryName = sprCategoryName;
	}

	public String getSprCategoryUrl() {
		return sprCategoryUrl;
	}

	public void setSprCategoryUrl(String sprCategoryUrl) {
		this.sprCategoryUrl = sprCategoryUrl;
	}

	public Date getSprCategotyCreateTime() {
		return sprCategotyCreateTime;
	}

	public void setSprCategotyCreateTime(Date sprCategotyCreateTime) {
		this.sprCategotyCreateTime = sprCategotyCreateTime;
	}

	public Date getSprCategoryUpdateTime() {
		return sprCategoryUpdateTime;
	}

	public void setSprCategoryUpdateTime(Date sprCategoryUpdateTime) {
		this.sprCategoryUpdateTime = sprCategoryUpdateTime;
	}

	public Integer getSprCategoryStatus() {
		return sprCategoryStatus;
	}

	public void setSprCategoryStatus(Integer sprCategoryStatus) {
		this.sprCategoryStatus = sprCategoryStatus;
	}

	public static final String SPR_CATEGORY_ID = "spr_category_id";

	public static final String SPR_CATEGORY_NAME = "spr_category_name";

	public static final String SPR_CATEGORY_URL = "spr_category_url";

	public static final String SPR_CATEGOTY_CREATE_TIME = "spr_categoty_create_time";

	public static final String SPR_CATEGORY_UPDATE_TIME = "spr_category_update_time";

	public static final String SPR_CATEGORY_STATUS = "spr_category_status";

	@Override
	protected Serializable pkVal() {
		return this.sprCategoryId;
	}

}
