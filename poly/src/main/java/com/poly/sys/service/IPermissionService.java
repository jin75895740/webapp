package com.poly.sys.service;

import java.util.Set;

public interface IPermissionService {
	/**
	 * 通过登录账户名获取拥有的权限
	 * @param account 账户名
	 * @return set 权限集合
	 */
	Set<String> findPermissionsByAccount(String account);
}
