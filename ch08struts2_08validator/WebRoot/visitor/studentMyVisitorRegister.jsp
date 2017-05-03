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
		<s:form action = "MyVisitorRegister">
		    <s:select name = "schoolName" label ="选择学校" list="{'西安交通大学','西北工业大学','西北农林科技大学','西北大学'}" emptyOption = "false" headerValue="--请选择--"></s:select>
			<s:textfield label="姓名" name="studentName"></s:textfield>
			<s:textfield label="学号" name="studentNo"></s:textfield>
			<s:textfield label="年龄" name = "age"></s:textfield>
			<s:submit value="提交" align="center"></s:submit>
		</s:form>
	</body>
</html>
