package com.tianyuan.common;

import java.util.List;

/**
 * 分页对象
 * @author WH1412009
 * @since 2016年12月19日
 */
public class PageObject {

	public final int DEFAULT_PAGE_SIZE = 10;
	/**
	 * 总记录数
	 */
	private int totalCount;
	/**
	 * 每页记录数
	 */
	private int pageSize = DEFAULT_PAGE_SIZE;
	/**
	 * 页索引
	 */
	private int pageIndex = 1;
	/**
	 * 查询参数对象
	 */
	private Object condition;
	
	/**
	 * selectStatement
	 */
	private String selectStatement;

	/**
	 * @return the totalCount
	 */
	public int getTotalCount() {
		return totalCount;
	}

	/**
	 * @param totalCount the totalCount to set
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * @return the pageIndex
	 */
	public int getPageIndex() {
		return pageIndex;
	}

	/**
	 * @param pageIndex the pageIndex to set
	 */
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	/**
	 * @return the condition
	 */
	public Object getCondition() {
		return condition;
	}

	/**
	 * @param condition the condition to set
	 */
	public void setCondition(Object condition) {
		this.condition = condition;
	}

	/**
	 * @return the selectStatement
	 */
	public String getSelectStatement() {
		return selectStatement;
	}

	/**
	 * @param selectStatement the selectStatement to set
	 */
	public void setSelectStatement(String selectStatement) {
		this.selectStatement = selectStatement;
	}

	/**
	 * @return the dEFAULT_PAGE_SIZE
	 */
	public int getDEFAULT_PAGE_SIZE() {
		return DEFAULT_PAGE_SIZE;
	}
	

}
