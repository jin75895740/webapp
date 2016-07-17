package com.poly.sys.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.poly.entity.User;
import com.poly.sys.dao.IUserDao;
import com.poly.sys.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource(name="userDao")
	private IUserDao userDao;
	
	public User findUserByAccount(String account) {
		return userDao.findUserByAccount(account);
	}

}
