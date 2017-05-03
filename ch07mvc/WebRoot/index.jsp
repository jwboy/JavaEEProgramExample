<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>

<!DOCTYPE HTML>
<html>
  <head>    
    <title>My JSP 'index.jsp' starting page</title>	
  </head>
  
  <body>
  	<jsp:forward page="student?action=list"></jsp:forward>
  </body>
</html>
