<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/core.jsp" %>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
</head>
<body>
	<form action="${ctx }/login" method="post">
		用户名:<input name="userAccount" />
		密码:<input name="userPwd" />
		<input type="submit" value="登录" />
	</form>
</body>
</html>