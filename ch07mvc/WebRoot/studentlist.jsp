<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>列出所有学生信息</title>
	<script type="text/javascript">
		function deleteConfirm() {
		var k=window.confirm('确认要删除吗？');
		//alert(k);
		return k;
	}
	</script>
</head>

<body>
	<h1>学生列表</h1>
	<table>
		<tr>
			<td>学号</td>
			<td>姓名</td>
			<td>年龄</td>
		</tr>

		<c:forEach var="student" items="${studentlist}">
			<tr>
				<td>${student.sid}</td>
				<td>${student.sname}</td>
				<td>${student.iage}</td>
				<td><a href="student?action=delete&sid=${student.sid}"
					onClick="return deleteConfirm()">删除</a></td>
				<td><a href="student?action=findedit&sid=${student.sid}">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="student?action=addnew">添加学生</a>
</body>
</html>
