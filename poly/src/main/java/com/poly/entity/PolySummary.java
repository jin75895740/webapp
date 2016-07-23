package com.poly.entity;

public class PolySummary {
	private int sid;
	private String name;
	private PolyDictionary dict;
	private int money;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PolyDictionary getDict() {
		return dict;
	}
	public void setDict(PolyDictionary dict) {
		this.dict = dict;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
