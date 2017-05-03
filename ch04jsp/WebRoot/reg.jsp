<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>注册</title>
  </head>
  <body>
  	<% 
  		//设定请求对象request的字符编码，保证获取的中文不会乱码
  		request.setCharacterEncoding("UTF-8");
  	%>
  	<!-- 设定Bean的scope为session，以便在userInfo.jsp中可以获取保存的内容 -->
     <jsp:useBean id="user" class="chap04.UserInfo" scope="session" />
     <jsp:setProperty property="*" name="user"/>
     <h2 align="center">注册成功</h2>
     <p align="center"><a href="userInfo.jsp">查看注册信息</a></p>
  </body>
</html> 
