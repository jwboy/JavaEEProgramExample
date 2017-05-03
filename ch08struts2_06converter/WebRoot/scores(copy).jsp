<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>My JSP 'scores.jsp' starting page</title>

<style type="text/css">
#nav li {
	display: inline;
	list-style-type: none;
	padding: 5px 50px;
}
</style>
</head>

<body>
	<ul id="nav">
		<li>姓名</li>
		<li>学号</li>
		<li>C语言成绩</li>
		<li>Java成绩</li>
		<li>J2EE成绩</li>
	</ul>
	<s:form action="showscores">
		<s:iterator value="new int[1]" status="st">
			<ul id="nav">
				<li style="”display: inline; list-style-type:"none;”><s:textfield
						name="%{'students['+#st.index+'].name'}">
					</s:textfield></li>
				<li style="”display: inline”"><s:textfield
						name="%{'students['+#st.index+'].number'}">
					</s:textfield></li>
				<li style="”display: inline”"><s:textfield
						name="%{'students['+#st.index+'].score.cScore'}">
					</s:textfield></li>
				<li style="”display: inline”"><s:textfield
						name="%{'students['+#st.index+'].score.javaScore'}">
					</s:textfield></li>
				<li style="”display: inline”"><s:textfield
						name="%{'students['+#st.index+'].score.j2eeScore'}">
					</s:textfield></li>
			</ul>
		</s:iterator>
		<s:submit value="提交"></s:submit>
	</s:form>
</body>
</html>
