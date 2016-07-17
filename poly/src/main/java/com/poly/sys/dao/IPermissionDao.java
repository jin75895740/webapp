package com.poly.sys.dao;

import java.util.Set;

import org.springframework.stereotype.Repository;

/**
 * 权限接口dao
 * @author bigpig
 *
 */
@Repository("permissionDao")
public interface IPermissionDao {
	/**
	 * 通过登录账户名获取拥有的权限
	 * @param account 账户名
	 * @return set 权限集合
	 */
	Set<String> findPermissionsByAccount(String account);
}
