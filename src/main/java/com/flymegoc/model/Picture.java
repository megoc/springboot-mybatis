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
@TableName("spr_picture")
public class Picture extends Model<Picture> {

    private static final long serialVersionUID = 1L;

    /**
     * Id
     */
    @TableId("spr_picture_id")
	private Float sprPictureId;
	@TableField("spr_picture_pinid")
	private String sprPicturePinid;
	@TableField("spr_picture_boardid")
	private String sprPictureBoardid;
	@TableField("spr_picture_bucket")
	private String sprPictureBucket;
	@TableField("spr_picture_key")
	private String sprPictureKey;
	@TableField("spr_picture_type")
	private String sprPictureType;
	@TableField("spr_picture_width")
	private Integer sprPictureWidth;
	@TableField("spr_picture_height")
	private Integer sprPictureHeight;
	@TableField("spr_picture_ratio")
	private Double sprPictureRatio;
	@TableField("spr_picture_reads")
	private Integer sprPictureReads;
	@TableField("spr_picture_likes")
	private Integer sprPictureLikes;
	@TableField("spr_picture_categoryid")
	private Integer sprPictureCategoryid;
	@TableField("spr_picture_create_time")
	private Date sprPictureCreateTime;
	@TableField("spr_picture_update_time")
	private Date sprPictureUpdateTime;


	public Float getSprPictureId() {
		return sprPictureId;
	}

	public void setSprPictureId(Float sprPictureId) {
		this.sprPictureId = sprPictureId;
	}

	public String getSprPicturePinid() {
		return sprPicturePinid;
	}

	public void setSprPicturePinid(String sprPicturePinid) {
		this.sprPicturePinid = sprPicturePinid;
	}

	public String getSprPictureBoardid() {
		return sprPictureBoardid;
	}

	public void setSprPictureBoardid(String sprPictureBoardid) {
		this.sprPictureBoardid = sprPictureBoardid;
	}

	public String getSprPictureBucket() {
		return sprPictureBucket;
	}

	public void setSprPictureBucket(String sprPictureBucket) {
		this.sprPictureBucket = sprPictureBucket;
	}

	public String getSprPictureKey() {
		return sprPictureKey;
	}

	public void setSprPictureKey(String sprPictureKey) {
		this.sprPictureKey = sprPictureKey;
	}

	public String getSprPictureType() {
		return sprPictureType;
	}

	public void setSprPictureType(String sprPictureType) {
		this.sprPictureType = sprPictureType;
	}

	public Integer getSprPictureWidth() {
		return sprPictureWidth;
	}

	public void setSprPictureWidth(Integer sprPictureWidth) {
		this.sprPictureWidth = sprPictureWidth;
	}

	public Integer getSprPictureHeight() {
		return sprPictureHeight;
	}

	public void setSprPictureHeight(Integer sprPictureHeight) {
		this.sprPictureHeight = sprPictureHeight;
	}

	public Double getSprPictureRatio() {
		return sprPictureRatio;
	}

	public void setSprPictureRatio(Double sprPictureRatio) {
		this.sprPictureRatio = sprPictureRatio;
	}

	public Integer getSprPictureReads() {
		return sprPictureReads;
	}

	public void setSprPictureReads(Integer sprPictureReads) {
		this.sprPictureReads = sprPictureReads;
	}

	public Integer getSprPictureLikes() {
		return sprPictureLikes;
	}

	public void setSprPictureLikes(Integer sprPictureLikes) {
		this.sprPictureLikes = sprPictureLikes;
	}

	public Integer getSprPictureCategoryid() {
		return sprPictureCategoryid;
	}

	public void setSprPictureCategoryid(Integer sprPictureCategoryid) {
		this.sprPictureCategoryid = sprPictureCategoryid;
	}

	public Date getSprPictureCreateTime() {
		return sprPictureCreateTime;
	}

	public void setSprPictureCreateTime(Date sprPictureCreateTime) {
		this.sprPictureCreateTime = sprPictureCreateTime;
	}

	public Date getSprPictureUpdateTime() {
		return sprPictureUpdateTime;
	}

	public void setSprPictureUpdateTime(Date sprPictureUpdateTime) {
		this.sprPictureUpdateTime = sprPictureUpdateTime;
	}

	public static final String SPR_PICTURE_ID = "spr_picture_id";

	public static final String SPR_PICTURE_PINID = "spr_picture_pinid";

	public static final String SPR_PICTURE_BOARDID = "spr_picture_boardid";

	public static final String SPR_PICTURE_BUCKET = "spr_picture_bucket";

	public static final String SPR_PICTURE_KEY = "spr_picture_key";

	public static final String SPR_PICTURE_TYPE = "spr_picture_type";

	public static final String SPR_PICTURE_WIDTH = "spr_picture_width";

	public static final String SPR_PICTURE_HEIGHT = "spr_picture_height";

	public static final String SPR_PICTURE_RATIO = "spr_picture_ratio";

	public static final String SPR_PICTURE_READS = "spr_picture_reads";

	public static final String SPR_PICTURE_LIKES = "spr_picture_likes";

	public static final String SPR_PICTURE_CATEGORYID = "spr_picture_categoryid";

	public static final String SPR_PICTURE_CREATE_TIME = "spr_picture_create_time";

	public static final String SPR_PICTURE_UPDATE_TIME = "spr_picture_update_time";

	@Override
	protected Serializable pkVal() {
		return this.sprPictureId;
	}

}
