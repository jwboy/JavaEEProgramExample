<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>结果</title>
  </head>
  <body>
    <% 
    	//设置request编码，保持与客户端一致
    	request.setCharacterEncoding("UTF-8");
    	//获取参数值为单值的参数
    	String name = request.getParameter("uName");
    	String sex = request.getParameter("sex");
    	//获取多值参数
    	String[] hobs = request.getParameterValues("hobs");
    	//将hobs转换为字符串
    	String hobStr = "";
    	for(String hob:hobs){
    		hobStr += hob + ",";
    	}
    %>
    <h2>调查结果</h2>
    	姓名：<%=name %><br/>
    	性别：<%=sex %><br/>
    	爱好：<%=hobStr %><br/>
  </body>
</html>
