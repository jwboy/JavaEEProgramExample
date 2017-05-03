<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML>
<html>
  <head>   
  <title>login.jsp</title>  
</head>  
<body>
<s:actionerror/>
<s:form action="loginvalidate">
<s:textfield name="username" label="用戶名" />
<s:textfield name="password" label="密码" />
<s:submit />
</s:form>
</body>
</html>
