<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>学生信息注册</title>

	</head>

	<body>
		<s:form action = "VisitorRegister">
			<s:textfield label="姓名" name="student.studentName"></s:textfield>
			<s:textfield label="学号" name="student.studentNo"></s:textfield>
			<s:textfield label="年龄" name="student.age"></s:textfield>
			<s:submit value="提交" align="center"></s:submit>
		</s:form>
	</body>
</html>
