<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>显示个人信息</title>
</head>
<body>
	<h4>你输入的信息!</h4>
	<p>
		姓名：
		<s:property value="studentName" />
	</p>
	<p>
		学号：
		<s:property value="studentNo" />
	</p>
	<p>
		专业：
		<s:property value="major" />
	</p>
</body>
</html>