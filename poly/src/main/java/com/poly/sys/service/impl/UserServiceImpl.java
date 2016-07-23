package com.poly.sys.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.poly.entity.PolyUser;
import com.poly.sys.dao.IPolyUserDao;
import com.poly.sys.service.IPolyUserService;

@Service("userService")
public class UserServiceImpl implements IPolyUserService {

	@Resource(name="userDao")
	private IPolyUserDao userDao;
	
	public PolyUser findUserByAccount(String account) {
		return userDao.findUserByAccount(account);
	}

}
