<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>新增用户</title>

<style type="text/css">
input {
	margin: 3px;
}
</style>
</head>
<body>
	<div style="margin: 20 100 0 100; align: center;">
		<form id="form" action="/sysManage/addUser.do" method="post">
			用户名: <input type="text" id="username" name="username" />
			<br />
			密码: <input type="password" id="password" name="password" />
			<br />
			性别: 
			<input type="radio" name="gender" value="1" id="male" /><label for="male">男</label>
			<input type="radio" name="gender" value="0" id="female" /><label for="female">女</label>
			<br />
			名称: <input type="text" name="actualName" />
			
			<br />
			<input type="button" value="提交"  onclick="addUser()" />
			<input type="reset" />
		</form>
	</div>
</body>

<script type="text/javascript">
	function addUser(){
		var username = document.getElementById('username').value;
		var password = document.getElementById('password').value;
		if(!username){
			alert("请输入用户名!");
			return;
		}
		if(!password){
			alert("请输入密码!");
			return;
		}
		
		var form = document.getElementsByTagName('form')[0];
		form.submit();
	}
</script>
</html>