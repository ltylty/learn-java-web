/**
 * 
 */
package com.tianyuan.dao.impl;

import org.springframework.stereotype.Repository;

import com.tianyuan.base.AbstractBaseDao;
import com.tianyuan.bean.UserBean;
import com.tianyuan.dao.UserDao;

/**
 * @author WH1506041
 * @since 2016年12月20日
 * 
 */
@Repository("userDao")
public class UserDaoImpl extends AbstractBaseDao implements UserDao {

	/* (non-Javadoc)
	 * @see com.tianyuan.dao.UserDao#deleteByPrimaryKey(java.lang.String)
	 */
	@Override
	public int deleteByPrimaryKey(String userId) {
		// TODO Auto-generated method stub
//		this.getSqlSession().delete("");
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.tianyuan.dao.UserDao#insert(com.tianyuan.bean.User)
	 */
	@Override
	public int insert(UserBean record) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.tianyuan.dao.UserDao#insertSelective(com.tianyuan.bean.User)
	 */
	@Override
	public int insertSelective(UserBean record) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.tianyuan.dao.UserDao#selectByPrimaryKey(java.lang.String)
	 */
	@Override
	public UserBean selectByPrimaryKey(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.tianyuan.dao.UserDao#updateByPrimaryKeySelective(com.tianyuan.bean.User)
	 */
	@Override
	public int updateByPrimaryKeySelective(UserBean record) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.tianyuan.dao.UserDao#updateByPrimaryKey(com.tianyuan.bean.User)
	 */
	@Override
	public int updateByPrimaryKey(UserBean record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
