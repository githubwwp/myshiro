<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>

<div style="margin: 10px 100px 0 100px; ">
	<h1 align="center">首页 <a href="${pageContext.request.contextPath}/page/loginJsp.do">登录</a>&nbsp;&nbsp;<a href="" >退出</a></h1>
	<a href="${pageContext.request.contextPath}/page/userManageJsp" >用户管理</a>
	<a href="${pageContext.request.contextPath}/page/roleManageJsp" >角色管理</a>
</div>

</body>
</html>