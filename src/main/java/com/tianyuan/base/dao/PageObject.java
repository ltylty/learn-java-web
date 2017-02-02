package com.tianyuan.base.dao;

public class PageObject {

	public final int DEFAULT_PAGE_SIZE = 10;
	
	private int totalCount;
	
	private int pageSize = DEFAULT_PAGE_SIZE;
	
	private int pageIndex = 1;
	
	private String statement;
	
	public int getOffset() {
		return pageSize * (pageIndex - 1);
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	
}
