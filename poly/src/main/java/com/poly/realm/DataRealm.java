package com.poly.realm;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.poly.entity.User;
import com.poly.sys.service.IPermissionService;
import com.poly.sys.service.IRoleService;
import com.poly.sys.service.IUserService;

public class DataRealm extends AuthorizingRealm {
	
	@Resource
	private IUserService userService;
	@Resource
	private IRoleService roleService;
	@Resource
	private IPermissionService permissionService;
	
	/**
	 * 为通过验证的用户授权
	 */
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
		// 取得通过验证的用户的用户名
		String account = (String)principal.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		authorizationInfo.setRoles(roleService.findRolesByAccount(account));
		authorizationInfo.setStringPermissions(permissionService.findPermissionsByAccount(account));
		return authorizationInfo;
	}

	/**
	 * 验证当前登录的用户
	 */
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		AuthenticationInfo authcInfo = null;
		String account = (String)token.getPrincipal();
		// 查询是否存在该账户
		User user = userService.findUserByAccount(account);
		if(user != null) {
			authcInfo = new SimpleAuthenticationInfo(user.getUserAccount(), user.getUserPwd(), "authcInfo");
		}
		return authcInfo;
	}
	
}
