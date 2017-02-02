package com.tianyuan.action.user;

import org.springframework.beans.factory.annotation.Autowired;

import com.tianyuan.base.action.BaseAction;
import com.tianyuan.model.user.UserModel;
import com.tianyuan.model.user.UserParameter;
import com.tianyuan.service.DefaultUserService;

public class LoginAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserParameter userParameter;
	
	private UserModel userModel;
	
	@Autowired
	private DefaultUserService defaultUserService;
	
	public String login() {
		userModel = defaultUserService.selectOneByParameter(userParameter);
		if(userModel.getPassword().equals(userParameter.getPassword())){
			return "login";
		}else{
			return "fail";
		}
	}

	public UserParameter getUserParameter() {
		return userParameter;
	}

	public void setUserParameter(UserParameter userParameter) {
		this.userParameter = userParameter;
	}

	public UserModel getUserModel() {
		return userModel;
	}

	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

}
