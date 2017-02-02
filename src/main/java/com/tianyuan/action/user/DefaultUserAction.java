package com.tianyuan.action.user;

import org.springframework.beans.factory.annotation.Autowired;

import com.tianyuan.base.action.AbstractDefaultAction;
import com.tianyuan.model.user.UserModel;
import com.tianyuan.model.user.UserParameter;
import com.tianyuan.service.DefaultUserService;

/**
 * The Class DefaultUserAction.
 */
public class DefaultUserAction extends AbstractDefaultAction<UserParameter, UserModel>{
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private DefaultUserService defaultUserService;
	
	@Override
	public void setBaseService() {
		// TODO Auto-generated method stub
		super.baseService = defaultUserService;
	}

}
