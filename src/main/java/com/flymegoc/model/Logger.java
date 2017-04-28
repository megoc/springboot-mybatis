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
@TableName("spr_logger")
public class Logger extends Model<Logger> {

    private static final long serialVersionUID = 1L;

	@TableId(value="loggerId", type= IdType.AUTO)
	private Integer loggerId;
	private String url;
	private String ipAdress;
	private String method;
	private String calssMethod;
	private String args;
	@TableField("create_time")
	private Date createTime;
	@TableField("update_time")
	private Date updateTime;


	public Integer getLoggerId() {
		return loggerId;
	}

	public void setLoggerId(Integer loggerId) {
		this.loggerId = loggerId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIpAdress() {
		return ipAdress;
	}

	public void setIpAdress(String ipAdress) {
		this.ipAdress = ipAdress;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getCalssMethod() {
		return calssMethod;
	}

	public void setCalssMethod(String calssMethod) {
		this.calssMethod = calssMethod;
	}

	public String getArgs() {
		return args;
	}

	public void setArgs(String args) {
		this.args = args;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public static final String LOGGERID = "loggerId";

	public static final String URL = "url";

	public static final String IPADRESS = "ipAdress";

	public static final String METHOD = "method";

	public static final String CALSSMETHOD = "calssMethod";

	public static final String ARGS = "args";

	public static final String CREATE_TIME = "create_time";

	public static final String UPDATE_TIME = "update_time";

	@Override
	protected Serializable pkVal() {
		return this.loggerId;
	}

}
