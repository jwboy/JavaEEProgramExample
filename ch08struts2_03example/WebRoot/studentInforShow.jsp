<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>学生信息显示</title>
</head>
<body>
	<h3>您输入的信息：</h3>
	姓名：
	<s:property value="studentName" />
	<br /> 学号：
	<s:property value="studentNo" />
	<br /> 专业：
	<s:property value="major" />
	<br />
</body>
</html>
