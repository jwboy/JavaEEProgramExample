<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	//注销会话
	session.invalidate();
	response.sendRedirect("sessionLogin.html");
%> 
