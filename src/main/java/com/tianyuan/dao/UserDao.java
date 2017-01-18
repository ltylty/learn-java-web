package com.tianyuan.dao;

import com.tianyuan.bean.UserBean;

public interface UserDao {
    int deleteByPrimaryKey(String userId);

    int insert(UserBean record);

    int insertSelective(UserBean record);

    UserBean selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserBean record);

    int updateByPrimaryKey(UserBean record);
}