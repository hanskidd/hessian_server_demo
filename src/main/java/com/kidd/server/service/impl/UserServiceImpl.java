package com.kidd.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kidd.api.domain.User;
import com.kidd.api.service.UserService;
import com.kidd.server.dao.UserMapper;

/**
 * 远程调用的服务项目业务service实现类
 * @author kidd
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	
	@Override
	public User getUserById(int id) {
		return new User(1, "张三", 1);
//		return userDao.getUserById(id);
	}


	@Override
	public Integer save(User user) {
		return userMapper.insert(user);
	}

}
