/**
 * 
 */
package com.tianyuan.base;

import java.util.List;

import com.tianyuan.common.PageObject;

// TODO: Auto-generated Javadoc
/**
 * The Interface BaseDao.
 *
 * @author wh1506041
 * @param <T1> parameter
 * @param <T2> model
 * @since 2017年1月20日
 */
public interface BaseDao<T1,T2> {
	
	/**
	 * Delete by patameter.
	 *
	 * @param patameter the patameter
	 */
	void deleteByPatameter(T1 patameter);

    /**
     * Insert.
     *
     * @param patameter the patameter
     * @return the string
     */
    String insertOne(T1 patameter);
    
    /**
     * Select one by patameter.
     *
     * @param patameter the patameter
     * @return the object
     */
    T2 selectOneByPatameter(T1 patameter);

    /**
     * Select list by patameter.
     *
     * @param patameter the patameter
     * @param page the page
     * @return the list
     */
    List<T2> selectListByPatameter(T1 patameter,PageObject page);

    /**
     * Update by patameter.
     *
     * @param patameter the patameter
     */
    void updateByPatameter(T1 patameter);
}
