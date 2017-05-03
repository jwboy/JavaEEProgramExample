<%@ page language="java" import="java.util.*,java.text.SimpleDateFormat" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Include指令的使用</title>
  </head>
  
  <body>
    <h1 align="center">欢迎来到Java Web社区</h1>
    <%
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日 HH:mm:ss");
		String date = sdf.format(new Date());
    %>
    <h3 align="center">服务器当前时间是<%= date %>.</h3>
    <%@include file="include.jsp" %>
  </body>
</html>
