package com.poly.sys.service.impl;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.poly.sys.dao.IRoleDao;
import com.poly.sys.service.IRoleService;

@Service("roleService")
public class RoleServiceImpl implements IRoleService {

	@Resource
	private IRoleDao roleDao;
	
	public Set<String> findRolesByAccount(String account) {
		return roleDao.findRolesByAccount(account);
	}

}
