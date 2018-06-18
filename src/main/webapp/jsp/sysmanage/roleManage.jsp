<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML>
<html>
  <head>
    
    <title>角色管理</title>

  </head>

<body>
	<h2 align="center">角色管理 <a href="${pageContext.request.contextPath}/index.jsp">首页</a></h2>

<div style="margin: 20 100 0 100; align: center;">
	<form style="hidden: false;" action="${pageContext.request.contextPath}/page/roleManageJsp.do" method="get">
		页码<input type="text" name="pageNum" id="pageNum" >
		尺寸<input type="text" name="pageSize" id="pageSize" >
	</form>
	
	<table id="userListTable" style="width: 100%;" border="1">
		<thead>
			<tr>
				<th>角色标识</th>
				<th>角色名称</th>
			</tr>
		</thead>
		<tbody id="table">
			<c:forEach items="${pi.list}" var="val">
				<tr>
					<td>${val.roleCode}</td>
					<td>${val.roleName}</td>
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
</script>
	
</html>
