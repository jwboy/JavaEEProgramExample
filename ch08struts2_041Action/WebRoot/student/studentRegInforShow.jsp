<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML>
<html>
<head>
<title>学生信息显示</title>
</head>
<body>
	学生信息如下：
	<hr />
	姓名：
	<s:property value="studentName" />
	<br> 学号：
	<s:property value="studentNo" />
	<br> 年龄：
	<s:property value="age" />
	<br>
	<hr />
</body>
</html>
