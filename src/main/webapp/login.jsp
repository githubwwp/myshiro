<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE htm">
<html>
<head>
<title>登录</title>
</head>
<body>

<div style="margin: 10px 100px 0 100px; ">
	<h1 align="center">登录</h1>
	<form action="${pageContext.request.contextPath}/login/login.do" method="post">
		用户名: <input type="text" name="username"  >
		<br />
		密码: <input type="password" name="password" >
		<br />
		<br />
		<input type="button" onclick="loginFn()" value="登录" >
		<input type="reset" >
	</form>
</div>

</body>

<script type="text/javascript">
	function loginFn(){
		var username = document.getElementsByName("username")[0].value;
		var password = document.getElementsByName("password")[0].value;
		if(!username || !password){
			alert("请输入用户名和密码");
			return;
		}
		document.getElementsByTagName("form")[0].submit();
	}
</script>

</html>