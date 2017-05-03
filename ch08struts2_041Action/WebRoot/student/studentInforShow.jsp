<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML>
<html>
	<head>
		<base href="<%=basePath%>">
		<title>学生信息显示</title>
	</head>
	<body>
		学生信息如下：
		<hr />
		姓名：
		<s:property value="studentName" />
		<br>
		学号：
		<s:property value="studentNo" />
		<br>
		年龄：
		<s:property value="age" />
		<br>
		<hr />
	</body>
</html>
