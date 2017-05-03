<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>验证页面</title>
  </head>
  
  <body>
     <%
     	//获得客户端提交的用户名和口令
     	String uname = request.getParameter("uName");
     	String passwd = request.getParameter("uPasswd");
     	if("Tom".equals(uname) && "1234".equals(passwd))
     	{
     %>
	     	<!-- 用户名和口令正确，跳转到欢迎页面，同时将用户名传递过去 -->
	     	<jsp:forward page="welcome.jsp">
	     		<jsp:param value="<%=uname%>" name="name"/>
	    		 </jsp:forward>
     <%
     	}
     	else{
     %>
     		<jsp:forward page="error.jsp" />
     <%  } %>
  </body>
</html>
