package com.poly.entity;

import java.sql.Timestamp;

import com.poly.util.DateUtil;

/**
 * 实体基类
 * @author bigpig
 * @version 0.0.1
 */
public class BaseBean {
	
	// 逻辑删除状态  0为删除， 1为存在
	private byte state;
	// 创建者
	private String creator;
	// 最后修改者
	private String lastUpdator;
	// 创建时间
	private Timestamp createTime;
	// 最后修改时间
	private Timestamp lastUpdateTime;
	// 备注
	private String remarks;
	
	private String timeStr;
	
	private String lastTimeStr;

	public String getTimeStr() {
		return timeStr;
	}

	

	public String getLastTimeStr() {
		return lastTimeStr;
	}

	

	public byte getState() {
		return state;
	}

	public void setState(byte state) {
		this.state = state;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
		this.timeStr = DateUtil.parseString(this.createTime);
	}

	public Timestamp getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Timestamp lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
		this.lastTimeStr = DateUtil.parseString(this.lastUpdateTime);
	}

	public String getLastUpdator() {
		return lastUpdator;
	}

	public void setLastUpdator(String lastUpdator) {
		this.lastUpdator = lastUpdator;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
