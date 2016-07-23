package com.poly.entity;

public class PolyModelNodes {
	private String pmno;
	private PolyUser user;
	private int levels; // 第几级节点
	public String getPmno() {
		return pmno;
	}
	public void setPmno(String pmno) {
		this.pmno = pmno;
	}
	public PolyUser getUser() {
		return user;
	}
	public void setUser(PolyUser user) {
		this.user = user;
	}
	public int getLevels() {
		return levels;
	}
	public void setLevels(int levels) {
		this.levels = levels;
	}
}
