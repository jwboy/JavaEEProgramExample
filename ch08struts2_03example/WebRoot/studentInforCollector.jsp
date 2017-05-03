<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>学生信息注册</title>
</head>
<body>
	<hr>
	<h4>请输入以下信息，并设置一个密码!</h4>
	<s:form action="StudentInforShow">
		<s:textfield label="姓名" name="studentName"></s:textfield>
		<s:textfield label="学号" name="studentNo"></s:textfield>
		<s:password label="密码" name="password"></s:password>
		<s:textfield label="专业" name="major"></s:textfield>
		<s:submit value="提交" align="center"></s:submit>
	</s:form>
</body>
</html>
