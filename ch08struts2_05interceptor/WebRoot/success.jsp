<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>欢迎登陆</title>
</head>
<body>
	<hr />
	欢迎
	<s:property value="username" />
	登陆
	<br>
	<%=new Date() %>
</body>
</html>
