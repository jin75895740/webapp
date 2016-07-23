package com.poly.entity;

public class PolyPaymentModel {
	private int pmid;
	private String pmno;
	private PolyDept dept;
	private int totalMoney;
	private PolyModelNodes[] pmNodes;
	public int getPmid() {
		return pmid;
	}
	public void setPmid(int pmid) {
		this.pmid = pmid;
	}
	public String getPmno() {
		return pmno;
	}
	public void setPmno(String pmno) {
		this.pmno = pmno;
	}
	public PolyDept getDept() {
		return dept;
	}
	public void setDept(PolyDept dept) {
		this.dept = dept;
	}
	public int getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}
	public PolyModelNodes[] getPmNodes() {
		return pmNodes;
	}
	public void setPmNodes(PolyModelNodes[] pmNodes) {
		this.pmNodes = pmNodes;
	}
	
}	
