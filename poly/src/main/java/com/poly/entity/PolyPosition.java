package com.poly.entity;

public class PolyPosition {
	private int posId;
	private String name;
	private PolyDept polyDept;
	private String code;
	public int getPosId() {
		return posId;
	}
	public void setPosId(int posId) {
		this.posId = posId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PolyDept getPolyDept() {
		return polyDept;
	}
	public void setPolyDept(PolyDept polyDept) {
		this.polyDept = polyDept;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
