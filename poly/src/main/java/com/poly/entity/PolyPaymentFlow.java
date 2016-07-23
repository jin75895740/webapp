package com.poly.entity;

import java.sql.Date;

public class PolyPaymentFlow {
	private int pfid;
	private PolyUser user; // 申请人
	private Date startDate;
	private PolyDictionaryType dictType;
	private int billsAmoutn; // 单据数
	private Date payDate;
	private String detailedReason; // 详细事由
	private String simpledReason; // 简化事由
	private int payMoney; // 用款金额
	private PolyOfficialDocumentsAttachment officalDoc; // 批文 
	private String officialDocTitle; // 批文标题
	private PolyPaymentContractAttachment paymentContractAtt;
	private int contractMoney; // 合同金额
	private String contractItems; // 合同约定付款条款
	private String budgetItems; // 预算项目
	private int budgetMoney; // 预算金额
	private int budgetPayedMoney; // 已付预算
	private String payee; // 收款人
	private String accountBank; // 开户银行
	private String bankAccounst; // 银行账号
	private String contacts; // 联系人
	private String contractsPhone; // 联系电话
	private int status; // 流程状态： 0.待审批,1.审批中，2.被退回，3.待付款，4.已完成
	private PolyPaymentModel paymentModel;
	
	public int getPfid() {
		return pfid;
	}
	public void setPfid(int pfid) {
		this.pfid = pfid;
	}
	public PolyUser getUser() {
		return user;
	}
	public void setUser(PolyUser user) {
		this.user = user;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public PolyDictionaryType getDictType() {
		return dictType;
	}
	public void setDictType(PolyDictionaryType dictType) {
		this.dictType = dictType;
	}
	public int getBillsAmoutn() {
		return billsAmoutn;
	}
	public void setBillsAmoutn(int billsAmoutn) {
		this.billsAmoutn = billsAmoutn;
	}
	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	public String getDetailedReason() {
		return detailedReason;
	}
	public void setDetailedReason(String detailedReason) {
		this.detailedReason = detailedReason;
	}
	public String getSimpledReason() {
		return simpledReason;
	}
	public void setSimpledReason(String simpledReason) {
		this.simpledReason = simpledReason;
	}
	public int getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(int payMoney) {
		this.payMoney = payMoney;
	}
	public PolyOfficialDocumentsAttachment getOfficalDoc() {
		return officalDoc;
	}
	public void setOfficalDoc(PolyOfficialDocumentsAttachment officalDoc) {
		this.officalDoc = officalDoc;
	}
	public String getOfficialDocTitle() {
		return officialDocTitle;
	}
	public void setOfficialDocTitle(String officialDocTitle) {
		this.officialDocTitle = officialDocTitle;
	}
	public PolyPaymentContractAttachment getPaymentContractAtt() {
		return paymentContractAtt;
	}
	public void setPaymentContractAtt(PolyPaymentContractAttachment paymentContractAtt) {
		this.paymentContractAtt = paymentContractAtt;
	}
	public int getContractMoney() {
		return contractMoney;
	}
	public void setContractMoney(int contractMoney) {
		this.contractMoney = contractMoney;
	}
	public String getContractItems() {
		return contractItems;
	}
	public void setContractItems(String contractItems) {
		this.contractItems = contractItems;
	}
	public String getBudgetItems() {
		return budgetItems;
	}
	public void setBudgetItems(String budgetItems) {
		this.budgetItems = budgetItems;
	}
	public int getBudgetMoney() {
		return budgetMoney;
	}
	public void setBudgetMoney(int budgetMoney) {
		this.budgetMoney = budgetMoney;
	}
	public int getBudgetPayedMoney() {
		return budgetPayedMoney;
	}
	public void setBudgetPayedMoney(int budgetPayedMoney) {
		this.budgetPayedMoney = budgetPayedMoney;
	}
	public String getPayee() {
		return payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}
	public String getAccountBank() {
		return accountBank;
	}
	public void setAccountBank(String accountBank) {
		this.accountBank = accountBank;
	}
	public String getBankAccounst() {
		return bankAccounst;
	}
	public void setBankAccounst(String bankAccounst) {
		this.bankAccounst = bankAccounst;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	public String getContractsPhone() {
		return contractsPhone;
	}
	public void setContractsPhone(String contractsPhone) {
		this.contractsPhone = contractsPhone;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public PolyPaymentModel getPaymentModel() {
		return paymentModel;
	}
	public void setPaymentModel(PolyPaymentModel paymentModel) {
		this.paymentModel = paymentModel;
	}
}
