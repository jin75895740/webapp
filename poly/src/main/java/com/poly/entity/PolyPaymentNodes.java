package com.poly.entity;

public class PolyPaymentNodes {
	private PolyPaymentFlow paymentFlow;
	private int levels;
	private String opinion;
	private String remarks;
	private PolyUser user;  // 当前审批的用户
	private PolyUser nextUser; // 下级审批的用户
	public PolyPaymentFlow getPaymentFlow() {
		return paymentFlow;
	}
	public void setPaymentFlow(PolyPaymentFlow paymentFlow) {
		this.paymentFlow = paymentFlow;
	}
	public int getLevels() {
		return levels;
	}
	public void setLevels(int levels) {
		this.levels = levels;
	}
	public String getOpinion() {
		return opinion;
	}
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public PolyUser getUser() {
		return user;
	}
	public void setUser(PolyUser user) {
		this.user = user;
	}
	public PolyUser getNextUser() {
		return nextUser;
	}
	public void setNextUser(PolyUser nextUser) {
		this.nextUser = nextUser;
	}
}
