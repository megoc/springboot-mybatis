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
@TableName("spr_fav_categories")
public class FavCategories extends Model<FavCategories> {

    private static final long serialVersionUID = 1L;

	@TableId(value="spr_fav_categories_id", type= IdType.AUTO)
	private Integer sprFavCategoriesId;
	@TableField("spr_fav_categories_name")
	private String sprFavCategoriesName;
    /**
     * 喜欢
     */
	@TableField("spr_fav_categories_likes")
	private Integer sprFavCategoriesLikes;
    /**
     * 是否公开
     */
	@TableField("spr_fav_categories_private")
	private Integer sprFavCategoriesPrivate;
	@TableField("spr_fav_categories_create_time")
	private Date sprFavCategoriesCreateTime;
	@TableField("spr_fav_categories_update_time")
	private Date sprFavCategoriesUpdateTime;
	@TableField("spr_fav_categories_userid")
	private Integer sprFavCategoriesUserid;


	public Integer getSprFavCategoriesId() {
		return sprFavCategoriesId;
	}

	public void setSprFavCategoriesId(Integer sprFavCategoriesId) {
		this.sprFavCategoriesId = sprFavCategoriesId;
	}

	public String getSprFavCategoriesName() {
		return sprFavCategoriesName;
	}

	public void setSprFavCategoriesName(String sprFavCategoriesName) {
		this.sprFavCategoriesName = sprFavCategoriesName;
	}

	public Integer getSprFavCategoriesLikes() {
		return sprFavCategoriesLikes;
	}

	public void setSprFavCategoriesLikes(Integer sprFavCategoriesLikes) {
		this.sprFavCategoriesLikes = sprFavCategoriesLikes;
	}

	public Integer getSprFavCategoriesPrivate() {
		return sprFavCategoriesPrivate;
	}

	public void setSprFavCategoriesPrivate(Integer sprFavCategoriesPrivate) {
		this.sprFavCategoriesPrivate = sprFavCategoriesPrivate;
	}

	public Date getSprFavCategoriesCreateTime() {
		return sprFavCategoriesCreateTime;
	}

	public void setSprFavCategoriesCreateTime(Date sprFavCategoriesCreateTime) {
		this.sprFavCategoriesCreateTime = sprFavCategoriesCreateTime;
	}

	public Date getSprFavCategoriesUpdateTime() {
		return sprFavCategoriesUpdateTime;
	}

	public void setSprFavCategoriesUpdateTime(Date sprFavCategoriesUpdateTime) {
		this.sprFavCategoriesUpdateTime = sprFavCategoriesUpdateTime;
	}

	public Integer getSprFavCategoriesUserid() {
		return sprFavCategoriesUserid;
	}

	public void setSprFavCategoriesUserid(Integer sprFavCategoriesUserid) {
		this.sprFavCategoriesUserid = sprFavCategoriesUserid;
	}

	public static final String SPR_FAV_CATEGORIES_ID = "spr_fav_categories_id";

	public static final String SPR_FAV_CATEGORIES_NAME = "spr_fav_categories_name";

	public static final String SPR_FAV_CATEGORIES_LIKES = "spr_fav_categories_likes";

	public static final String SPR_FAV_CATEGORIES_PRIVATE = "spr_fav_categories_private";

	public static final String SPR_FAV_CATEGORIES_CREATE_TIME = "spr_fav_categories_create_time";

	public static final String SPR_FAV_CATEGORIES_UPDATE_TIME = "spr_fav_categories_update_time";

	public static final String SPR_FAV_CATEGORIES_USERID = "spr_fav_categories_userid";

	@Override
	protected Serializable pkVal() {
		return this.sprFavCategoriesId;
	}

}
