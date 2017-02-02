/**
 * 
 */
package com.tianyuan.base.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.support.SqlSessionDaoSupport;


/**
 * @author wh1506041
 * @since 2017年1月18日
 * 
 */
public abstract class AbstractBaseDao<T1 , T2> extends SqlSessionDaoSupport implements BaseDao<T1, T2> {

	@Override
	public void deleteByParameter(T1 parameter) {
		// TODO Auto-generated method stub
		this.getSqlSession().delete(DefaultStatement.deleteByParameter.toString());
	}

	@Override
	public String insertOrUpdateByParameter(T1 parameter) {
		// TODO Auto-generated method stub
		this.getSqlSession().delete("");
		return null;
	}

	@Override
	public T2 selectOneByParameter(T1 parameter) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne(DefaultStatement.selectOneByParameter.toString(), parameter);
	}

	@Override
	public List<T2> selectListByParameter(T1 parameter, PageObject page) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList
				(DefaultStatement.selectListByParameter.toString(), parameter, new RowBounds(page.getOffset(), page.getPageSize()));
	}
	
	
}
