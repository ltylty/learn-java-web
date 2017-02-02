package com.tianyuan.base.service;

import java.util.List;

import com.tianyuan.base.dao.BaseDao;
import com.tianyuan.base.dao.PageObject;

public abstract class AbstractBaseService<T1, T2> implements BaseService<T1, T2> {
	protected BaseDao<T1, T2> baseDao; 
	
	@Override
	public void deleteByParameter(T1 parameter) {
		// TODO Auto-generated method stub
		setBaseDao();
		baseDao.deleteByParameter(parameter);
	}

	@Override
	public String insertOrUpdateByParameter(T1 parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T2 selectOneByParameter(T1 parameter) {
		// TODO Auto-generated method stub
		setBaseDao();
		return baseDao.selectOneByParameter(parameter);
	}

	@Override
	public List<T2> selectListByParameter(T1 parameter, PageObject page) {
		// TODO Auto-generated method stub
		setBaseDao();
		return baseDao.selectListByParameter(parameter, page);
	}
	
	public abstract void setBaseDao();

}
