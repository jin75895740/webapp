package com.poly.sys.dao;

import org.springframework.stereotype.Repository;

import com.poly.entity.User;

@Repository("userDao")
public interface IUserDao {
	
	public User findUserByAccount(String account);
	
}
