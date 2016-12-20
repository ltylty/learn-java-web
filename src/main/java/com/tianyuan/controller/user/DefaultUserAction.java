package com.tianyuan.controller.user;

import com.tianyuan.base.BaseAction;
import com.tianyuan.mapper.UserMapper;

public class DefaultUserAction extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserMapper userMapper;

	public String login() {
		System.out.println("hello");
		return "login";
	}

	/**
	 * @return the userMapper
	 */
	public UserMapper getUserMapper() {
		return userMapper;
	}

	/**
	 * @param userMapper the userMapper to set
	 */
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	

	
}
