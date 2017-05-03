<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>用户登录</title>
</head>
<body>
	<s:actionmessage />
	<!--  s:form action="TimeTest">-->
	<!--  s:form action="TokenTest">-->
	<!--  s:form action="MyTokenTest">-->
	<s:form action="TimeTest">
		<s:textfield label="姓名" name="username"></s:textfield>
		<s:password name="password" label="密码"></s:password>
		<s:submit value="提交" align="center"></s:submit>
		<s:token />			
	</s:form>
</body>
</html>
