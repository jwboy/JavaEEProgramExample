<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	//获取绑定在session对象上的userInfo
	Object tmp = session.getAttribute("userInfo");	
	//如果user为空，表明用户尚未登录，跳转到登录页面
	if(tmp == null){
		  response.sendRedirect("sessionLogin.html");
	  return;
	}
	HashMap<String,String> user = (HashMap<String,String> )tmp;
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>被保护页面</title>
  </head>
  <body>
     <h2 align="center"> <%=user.get("nickName") %> 欢迎你!本页面主要登录用户才能看到。</h2>
     <p align="center"><a href="invalidate.jsp">退出登录</a></p>
  </body>
</html> 

