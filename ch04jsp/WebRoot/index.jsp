<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>第一个JSP程序</title>    
  </head>  
  <body>
    <table border="1" width="400" align="center">
    	<%
    		for(int i=0;i<10;i++)
    		{
    	%>
    	<tr>
    		<td>这是动态产生的第<%=i %>行</td>
    	</tr>
    	<%} %>
    </table>
  </body>
</html>
