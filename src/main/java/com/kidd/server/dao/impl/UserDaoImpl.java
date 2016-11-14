package com.kidd.server.dao.impl;

import org.springframework.stereotype.Repository;

import com.kidd.api.domain.User;
import com.kidd.server.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao{

	/**
	 * 模拟从数据库获取数据
	 */
	@Override
	public User getUserById(int id) {
		return new User(1, "jack", 1);
	}

	
}
