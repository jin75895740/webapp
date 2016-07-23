package com.poly.entity;

public class PolyPosition {
	private int posId;
	private String posName;
	private PolyDept polyDept;
	private int totalMoney;
	public int getPosId() {
		return posId;
	}
	public void setPosId(int posId) {
		this.posId = posId;
	}
	public String getPosName() {
		return posName;
	}
	public void setPosName(String posName) {
		this.posName = posName;
	}
	public PolyDept getPolyDept() {
		return polyDept;
	}
	public void setPolyDept(PolyDept polyDept) {
		this.polyDept = polyDept;
	}
	public int getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}
}
