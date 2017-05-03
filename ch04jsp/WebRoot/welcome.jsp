<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Welcome</title>
  </head>
  <body>
    <%
    	//获取从forward动作传递的用户名
    	String uname = request.getParameter("name");
    	String date = new Date().toString();
    %>
    <p><%=uname %>，你好！</p>
    <p>欢迎访问本网站。</p>
    <p>当前时间是<%=date %></p>
  </body>
</html>
