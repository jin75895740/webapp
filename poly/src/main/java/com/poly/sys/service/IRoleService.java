package com.poly.sys.service;

import java.util.Set;

public interface IRoleService {
	
	Set<String> findRolesByAccount(String account);
	
}
