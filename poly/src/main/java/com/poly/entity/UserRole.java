package com.poly.entity;
/**
 * 用户与角色中间表
 * @author 俞宏亮
 * @version 0.0.1
 * @date 2016年4月26日  上午9:41:50
 */
public class UserRole {
	
	private Long id;
	//用户账号
	private String userAccount;
	//角色代码
	private String roleCode;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	
	
}
