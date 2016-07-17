package com.poly.entity;
/**
 * 用户实体
 * @author bigpig
 * @version 0.0.1
 */
public class User extends BaseBean {
	// 用户ID
	private Long userId;
	// 用户账号
	private String userAccount;
	// 用户密码
	private String userPwd;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
}
