<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>学生信息注册</title>
</head>
<body>
	<s:form>
		<s:textfield label="姓名" name="studentName"></s:textfield>
		<s:textfield label="学号" name="studentNo"></s:textfield>
		<s:textfield label="年龄" name="age"></s:textfield>
		<s:submit value="提交" align="center"></s:submit>
	</s:form>
</body>
</html>
