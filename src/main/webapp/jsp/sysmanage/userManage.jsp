<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
 <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>用户管理</title>
</head>
<body>
<h2 align="center">用户管理 <a href="${pageContext.request.contextPath}/index.jsp">首页</a></h2>

<div style="margin: 20 100 0 100; align: center;">
	<form style="hidden: false;" action="${pageContext.request.contextPath}/page/userManageJsp.do" method="get">
		用户名 <input type="text" name="username" id="username" >
		页码<input type="text" name="pageNum" id="pageNum" >
		尺寸<input type="text" name="pageSize" id="pageSize" >
	</form>
	
	<form id="delUserForm" style="display: none;" action="${pageContext.request.contextPath}/sysManage/delUer.do" method="post">
		userId<input type="text" name="userId" id="userId" >
	</form>
	
	<div>
		<a href="${pageContext.request.contextPath}/page/addUserJsp.do" >新增用户</a>
	</div>
	
	<table id="userListTable" style="width: 100%;" border="1">
		<thead>
			<tr>
				<th>用户名</th>
				<th>姓名</th>
				<th>性别</th>
				<th>生日</th>
				<th>年龄</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody id="table">
			<c:forEach items="${pi.list}" var="val">
				<tr>
					<td>${val.username}</td>
					<td>${val.actualName}</td>
					<td>${val.gender}</td>
					<td>${val.birthday}</td>
					<td>3</td>
					<td><a href="javascript:delUserFn(${val.userId})">删除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div style="margin: 5; float: right;">
		<a href="javascript: pageFn(1)">首页</a>
		<a href="javascript: pageFn(${pi.prePage})">上一页</a>
		<a href="javascript: pageFn(${pi.nextPage})">下一页</a>
		<a href="javascript: pageFn(${pi.lastPage})">尾页</a>
	</div>
	<div style="clear: both;"></div>
</div>
</body>

<script type="text/javascript">
	function pageFn(pageNum){
		document.getElementById("pageNum").value=pageNum;
		document.getElementsByTagName('form')[0].submit();
	}
	
	function delUserFn(userId){
		if(confirm("是否删除用户!")){
			document.getElementById("userId").value=userId;
			document.getElementById("delUserForm").submit();
		}
	}
</script>
</html>