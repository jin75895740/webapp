package com.poly.entity;

public class Permission extends BaseBean {
	
	// 权限ID
	private Long permissionId;
	// 角色代码
	private String roleCode;
	// 权限字符串
	private String permissionString;
	public Long getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getPermissionString() {
		return permissionString;
	}
	public void setPermissionString(String permissionString) {
		this.permissionString = permissionString;
	}
}
