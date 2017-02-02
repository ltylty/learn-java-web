/**
 * 
 */
package com.tianyuan.dao.impl;

import org.springframework.stereotype.Repository;

import com.tianyuan.base.dao.AbstractBaseDao;
import com.tianyuan.dao.UserDao;
import com.tianyuan.model.user.UserModel;
import com.tianyuan.model.user.UserParameter;

/**
 * @author WH1506041
 * @since 2016年12月20日
 * 
 */
@Repository("userDao")
public class UserDaoImpl extends AbstractBaseDao<UserParameter, UserModel> implements UserDao {

}
