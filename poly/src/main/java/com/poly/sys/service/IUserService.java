package com.poly.sys.service;

import com.poly.entity.User;

public interface IUserService {
	
	public User findUserByAccount(String account);
	
}
