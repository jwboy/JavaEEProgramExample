<%@ page language="java" import="java.util.*"	contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>编辑学生信息</title>
</head>
<body>
	${type}
	<c:if test="${type==\"add\"}">添加学生</c:if>
	<c:if test="${type==\"edit\"}">修改学生</c:if>
	<form action="student?action=${type}save" method="post">
		<table>
			<tr>
				<td>学号</td>
				<td><c:if test="${empty student}">
						<input type="text" name="sid" />
					</c:if> <c:if test="${! empty student}">
						<input type="hidden" name="sid" value="${student.sid}" />${student.sid}
    				</c:if></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><c:if test="${empty student}">
						<input type="text" name="sname" />
					</c:if> <c:if test="${! empty student}">
						<input type="text" name="sname" value="${student.sname}" />
					</c:if></td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><c:if test="${empty student}">
						<input type="text" name="sage" />
					</c:if> <c:if test="${! empty student}">
						<input type="text" name="sage" value="${student.iage}" />
					</c:if></td>
			</tr>
			<tr>
				<td><input type="submit" value="确定" /></td>
				<td><input type="reset" value="重置" /></td>
			</tr>
		</table>
	</form>
	<a href="student?action=list">学生列表</a>
</body>
</html>
