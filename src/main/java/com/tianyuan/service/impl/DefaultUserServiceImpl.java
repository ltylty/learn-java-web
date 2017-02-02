/**
 * 
 */
package com.tianyuan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tianyuan.base.service.AbstractBaseService;
import com.tianyuan.dao.UserDao;
import com.tianyuan.model.user.UserModel;
import com.tianyuan.model.user.UserParameter;
import com.tianyuan.service.DefaultUserService;

@Service("defaultUserService")
public class DefaultUserServiceImpl extends AbstractBaseService<UserParameter, UserModel> implements DefaultUserService {
	
	@Autowired
	UserDao userDao;
	
	public void setBaseDao(){
		super.baseDao = userDao;
	}
}
