package com.poly.sys.service;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;

import com.poly.entity.PolyUser;;

public interface IPolyUserService {
	
	public PolyUser findUserByAccount(String account);
	
}
