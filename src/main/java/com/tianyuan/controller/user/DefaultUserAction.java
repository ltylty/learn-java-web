package com.tianyuan.controller.user;

import org.springframework.beans.factory.annotation.Autowired;

import com.tianyuan.base.BaseAction;
import com.tianyuan.mapper.UserMapper;
import com.tianyuan.model.UserModel;
import com.tianyuan.service.CoreUserService;

/**
 * The Class DefaultUserAction.
 */
public class DefaultUserAction extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserModel userModel;
	
	@Autowired
	private CoreUserService coreUserService;

	public String login() {
		System.out.println("hello");
		return "login";
	}

	/**
	 * @return the userModel
	 */
	public UserModel getUserModel() {
		return userModel;
	}

	/**
	 * @param userModel the userModel to set
	 */
	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}

}
