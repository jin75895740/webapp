package com.poly.entity;

public class PolyUser {
	private int uid;
	private String account;     // 账号
	private String pwd;
	private String userName;    // 姓名
	private PolyDept polyDept;
	private PolyPosition polyPos;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public PolyDept getPolyDept() {
		return polyDept;
	}
	public void setPolyDept(PolyDept polyDept) {
		this.polyDept = polyDept;
	}
	public PolyPosition getPolyPos() {
		return polyPos;
	}
	public void setPolyPos(PolyPosition polyPos) {
		this.polyPos = polyPos;
	}
	
}
