/**
 * 
 */
package com.tianyuan.base.dao;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Interface BaseDao.
 *
 * @author wh1506041
 * @param <T1> parameter
 * @param <T2> model
 * @since 2017年1月20日
 */
public interface BaseDao<T1 ,T2> {
	
	/**
	 * Delete by parameter.
	 *
	 * @param parameter the parameter
	 */
	void deleteByParameter(T1 parameter);

    /**
     * Insert.
     *
     * @param parameter the parameter
     * @return the string
     */
    String insertOrUpdateByParameter(T1 parameter);
    
    /**
     * Select one by parameter.
     *
     * @param parameter the parameter
     * @return the object
     */
    T2 selectOneByParameter(T1 parameter);

    /**
     * Select list by parameter.
     *
     * @param parameter the parameter
     * @param page the page
     * @return the list
     */
    List<T2> selectListByParameter(T1 parameter,PageObject page);

}
