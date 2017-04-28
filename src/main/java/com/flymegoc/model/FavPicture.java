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
@TableName("spr_fav_picture")
public class FavPicture extends Model<FavPicture> {

    private static final long serialVersionUID = 1L;

	@TableId(value="spr_fav_picture_id", type= IdType.AUTO)
	private Integer sprFavPictureId;
	@TableField("spr_fav_picture_userid")
	private Integer sprFavPictureUserid;
	@TableField("spr_fav_picture_fav_categoryid")
	private Integer sprFavPictureFavCategoryid;
	@TableField("spr_fav_picture_pictureid")
	private Float sprFavPicturePictureid;
	@TableField("spr_fav_picture_create_time")
	private Date sprFavPictureCreateTime;
	@TableField("spr_fav_picture_update_time")
	private Date sprFavPictureUpdateTime;


	public Integer getSprFavPictureId() {
		return sprFavPictureId;
	}

	public void setSprFavPictureId(Integer sprFavPictureId) {
		this.sprFavPictureId = sprFavPictureId;
	}

	public Integer getSprFavPictureUserid() {
		return sprFavPictureUserid;
	}

	public void setSprFavPictureUserid(Integer sprFavPictureUserid) {
		this.sprFavPictureUserid = sprFavPictureUserid;
	}

	public Integer getSprFavPictureFavCategoryid() {
		return sprFavPictureFavCategoryid;
	}

	public void setSprFavPictureFavCategoryid(Integer sprFavPictureFavCategoryid) {
		this.sprFavPictureFavCategoryid = sprFavPictureFavCategoryid;
	}

	public Float getSprFavPicturePictureid() {
		return sprFavPicturePictureid;
	}

	public void setSprFavPicturePictureid(Float sprFavPicturePictureid) {
		this.sprFavPicturePictureid = sprFavPicturePictureid;
	}

	public Date getSprFavPictureCreateTime() {
		return sprFavPictureCreateTime;
	}

	public void setSprFavPictureCreateTime(Date sprFavPictureCreateTime) {
		this.sprFavPictureCreateTime = sprFavPictureCreateTime;
	}

	public Date getSprFavPictureUpdateTime() {
		return sprFavPictureUpdateTime;
	}

	public void setSprFavPictureUpdateTime(Date sprFavPictureUpdateTime) {
		this.sprFavPictureUpdateTime = sprFavPictureUpdateTime;
	}

	public static final String SPR_FAV_PICTURE_ID = "spr_fav_picture_id";

	public static final String SPR_FAV_PICTURE_USERID = "spr_fav_picture_userid";

	public static final String SPR_FAV_PICTURE_FAV_CATEGORYID = "spr_fav_picture_fav_categoryid";

	public static final String SPR_FAV_PICTURE_PICTUREID = "spr_fav_picture_pictureid";

	public static final String SPR_FAV_PICTURE_CREATE_TIME = "spr_fav_picture_create_time";

	public static final String SPR_FAV_PICTURE_UPDATE_TIME = "spr_fav_picture_update_time";

	@Override
	protected Serializable pkVal() {
		return this.sprFavPictureId;
	}

}
