package com.tianyuan.controller.user;

import com.tianyuan.base.BaseAction;
import com.tianyuan.bean.User;

public class DefaultUserAction extends BaseAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private User user;

	public String login(){
		return "login";
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
