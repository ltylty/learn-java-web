/**
 * 
 */
package com.tianyuan.base;

import org.mybatis.spring.support.SqlSessionDaoSupport;


/**
 * @author wh1506041
 * @since 2017年1月18日
 * 
 */
public abstract class AbstractBaseDao<T1, T2> extends SqlSessionDaoSupport implements BaseDao<T1, T2>{

}
