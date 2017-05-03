<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%! int cnt; //用于保存页面被访问的次数%>
<hr align="center" width="90%" />
<p align="center">
	你好! <%= request.getParameter("name") %>!
	本页面被访问了<%= cnt++ %>次。<br/>
	信息工程学院版权所有 2015!
</p>
