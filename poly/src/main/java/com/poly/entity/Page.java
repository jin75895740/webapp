package com.poly.entity;

import java.util.List;

/**
*@author 作者 fantasyBaby
*@version 创建时间:2016年4月29日下午3:05:57
*类说明
*/
public class Page {
	
	//每页显示所少条
	private int pageSize = 2;
	//总条数
	private int rowCount = 0;
	//总页数
	private int pageCount = 1;
	//当前页
	private int pageNo = 1;
	//搜索起始位置
	private int startIndex = 1;
	//搜索结束位置
	private int endIndex = 1;
	//第一页
	private int firstPageNo = 1;
	//上一页
	private int perPageNo = 1;
	//下一页
	private int nextPageNo = 1;
	//最后一页
	private int lastPageNo = 1;
	//结果集
	private List<?> list;
	
	
	//根据每页显示的条数以及显示第几页来计算出分页时的起始位置和结束位置
	public Page(int pageSize,int pageNo){
		this.pageSize = pageSize;
		this.pageNo = pageNo;
		startIndex = pageSize * (pageNo - 1) + 1;
		endIndex = pageSize * pageNo;
	}
	//将分页的结果集放到list列表里面，根据记录条数计算出page类里面所有属性的值
	public void setResult(List<?> list,int rowCount){
		this.list = list;
		this.rowCount = rowCount;
		if(rowCount % pageSize == 0){
			pageCount = rowCount / pageSize;
		}else{
			pageCount = rowCount / pageSize + 1;
		}
		this.lastPageNo = pageCount;
		if(pageNo > 1){
			perPageNo = (pageNo - 1);
		}
		if(pageNo == lastPageNo){
			nextPageNo = lastPageNo;
		}else{
			nextPageNo = pageNo + 1;
		}
		
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getRowCount() {
		return rowCount;
	}
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public int getEndIndex() {
		return endIndex;
	}
	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}
	public int getFirstPageNo() {
		return firstPageNo;
	}
	public void setFirstPageNo(int firstPageNo) {
		this.firstPageNo = firstPageNo;
	}
	public int getPerPageNo() {
		return perPageNo;
	}
	public void setPerPageNo(int perPageNo) {
		this.perPageNo = perPageNo;
	}
	public int getNextPageNo() {
		return nextPageNo;
	}
	public void setNextPageNo(int nextPageNo) {
		this.nextPageNo = nextPageNo;
	}
	public int getLastPageNo() {
		return lastPageNo;
	}
	public void setLastPageNo(int lastPageNo) {
		this.lastPageNo = lastPageNo;
	}
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
}
