<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>输入个人信息</title>
</head>
<body>
	<h4>请输入个人信息!</h4>
	<s:form action="StudentInforShow001">
		<s:textfield name="studentName" label="姓名" />
		<s:textfield name="studentNo" label="学号" />
		<s:password name="password" label="密码" />
		<s:textfield name="major" label="专业" />
		<s:submit />
	</s:form>
</body>

</html>