<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>学生信息注册</title>
</head>
<body>
	<s:form action="annotatedRegister">
		<s:textfield label="姓名" name="studentName"></s:textfield>
		<s:textfield label="学号" name="studentNo"></s:textfield>
		<s:textfield label="年龄" name="age"></s:textfield>
		<s:submit value="提交" align="center"></s:submit>
	</s:form>
</body>
</html>
