package com.poly.entity;

public class PolyDictionaryType {
	private String dictCode;
	private String dictName;
	private PolyDictionary[] dicts;
	public String getDictCode() {
		return dictCode;
	}
	public void setDictCode(String dictCode) {
		this.dictCode = dictCode;
	}
	public String getDictName() {
		return dictName;
	}
	public void setDictName(String dictName) {
		this.dictName = dictName;
	}
	public PolyDictionary[] getDicts() {
		return dicts;
	}
	public void setDicts(PolyDictionary[] dicts) {
		this.dicts = dicts;
	}
}	
