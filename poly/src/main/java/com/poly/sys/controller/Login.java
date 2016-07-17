package com.poly.sys.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.poly.entity.User;

@Controller
@RequestMapping("/")
public class Login {
	
	private Logger log = Logger.getLogger(Login.class);
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(User user, HttpSession session) {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUserAccount(), user.getUserPwd());
		try {
			subject.login(token);
//			User loginUser = (User) subject.getPrincipal();
//			session.setAttribute(Cons.KEY_LOGIN_USER, loginUser);
			return "redirect:/index.jsp";
		} catch (UnknownAccountException e1) {
			e1.printStackTrace();
			log.info("用户名不存在！" + e1.getMessage());
			System.out.println("用户名不存在！");
		} catch (AuthenticationException e2) {
			e2.printStackTrace();
			log.info("密码错误!" + e2.getMessage());
			System.out.println("密码错误!");
		} catch (Exception ex) {
			ex.printStackTrace();
			log.info("未知错误!请联系管理员!" + ex.getMessage());
			System.out.println("未知错误!请联系管理员!");
		}
		return "redirect:/login.jsp";
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout() {
		Subject subject = SecurityUtils.getSubject();
		if (subject.isAuthenticated()) {
			subject.logout(); // session 会销毁，在SessionListener监听session销毁，清理权限缓存
		}
		return "redirect:/login.jsp";
	}
}
