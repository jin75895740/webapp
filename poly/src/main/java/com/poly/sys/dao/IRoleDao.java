package com.poly.sys.dao;

import java.util.Set;

import org.springframework.stereotype.Repository;

@Repository("roleDao")
public interface IRoleDao {
	Set<String> findRolesByAccount(String account);
}
