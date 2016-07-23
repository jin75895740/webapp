package com.poly.sys.dao;

import org.springframework.stereotype.Repository;

import com.poly.entity.PolyUser;

@Repository("userDao")
public interface IPolyUserDao {
	
	public PolyUser findUserByAccount(String account);
	
}
