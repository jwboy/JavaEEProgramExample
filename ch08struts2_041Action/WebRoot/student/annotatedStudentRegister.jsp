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
		<title>学生信息注册</title>
	</head>
	<body>
		<s:form action = "register">
		<s:textfield label = "姓名" name = "studentName"></s:textfield>
		<s:textfield label = "学号" name = "studentNo"></s:textfield>
		<s:textfield label = "年龄" name = "age"></s:textfield>
		<s:submit value="提交" align="center"></s:submit>
		</s:form>	
	</body>
</html>
