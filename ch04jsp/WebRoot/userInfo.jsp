<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>注册信息</title>
  </head>
  <body>
    <h2>注册信息</h2>
    <jsp:useBean id="user" scope="session" class="chap04.UserInfo" />
    姓名：<jsp:getProperty property="uName" name="user"/><br />
    性别：<jsp:getProperty property="sex" name="user"/><br />
    家庭住址：<jsp:getProperty property="homeAddress" name="user"/><br />
    教育程度：<jsp:getProperty property="education" name="user"/>
  </body>
</html>
