<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>执行时间</title>
	</head>
	<body>
		Action执行的时间为：
		<s:property value="time" /><br>
		<s:property value="username" /><br>
		<s:property value="password" />
		<s:actionmessage />
	</body>
</html>
