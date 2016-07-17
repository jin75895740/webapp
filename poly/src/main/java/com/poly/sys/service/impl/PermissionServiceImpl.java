package com.poly.sys.service.impl;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.poly.sys.dao.IPermissionDao;
import com.poly.sys.service.IPermissionService;
@Service("permissionService")
public class PermissionServiceImpl implements IPermissionService {

	@Resource
	private IPermissionDao permissionDao;
	
	@Override
	public Set<String> findPermissionsByAccount(String account) {
		return permissionDao.findPermissionsByAccount(account);
	}

}
