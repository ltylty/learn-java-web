package com.tianyuan.base.service;

import java.util.List;

import com.tianyuan.base.dao.PageObject;

public interface BaseService<T1 ,T2> {
	void deleteByParameter(T1 parameter);

   
    String insertOrUpdateByParameter(T1 parameter);
    
    
    T2 selectOneByParameter(T1 parameter);

    List<T2> selectListByParameter(T1 parameter,PageObject page);
}
