package com.poly.entity;

public class PolyDictionary {
	private int did;
	private String dictOptions;
	private PolyDictionaryType dictType;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDictOptions() {
		return dictOptions;
	}
	public void setDictOptions(String dictOptions) {
		this.dictOptions = dictOptions;
	}
	public PolyDictionaryType getDictType() {
		return dictType;
	}
	public void setDictType(PolyDictionaryType dictType) {
		this.dictType = dictType;
	}
}
