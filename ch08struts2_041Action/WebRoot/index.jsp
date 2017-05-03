<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML>
<html>
<head>
<title>Home</title>
<!--  META HTTP-EQUIV="Refresh" CONTENT="10;URL=WelcomeRegister.action" -->
</head>
<body>
	<h3>Home</h3>
	<p>
		path =
		<%=path%><br /> base =
		<%=basePath%>
	</p>
	<hr />
	<p>
		&lt;package name=&quot;jwstrust&quot;
		extends=&quot;struts-default&quot;&gt;<br /> &lt;action
		name=&quot;HelloWorld&quot; class=&quot;HelloWorld&quot;&gt;<br />
		&lt;result&gt;/HelloWorld.jsp&lt;/result&gt;<br /> &lt;/action&gt;<br />
		&lt;action name=&quot;StudentInforCollector001&quot;&gt;<br />
		&lt;result&gt;/student/studentInforCollector001.jsp &lt;/result&gt;<br />
		&lt;/action&gt;<br /> &lt;action name=&quot;StudentInforShow001&quot;
		class=&quot;actions.StudentInforAction&quot;&gt;<br /> &lt;result
		name=&quot;success&quot;&gt;/student/studentInforShow001.jsp&lt;/result&gt;<br />
		&lt;/action&gt;<br /> &lt;/package&gt;<br />
	</p>
	<h4>HelloWorld示例</h4>
	<a href="HelloWorld.action">action00：HelloWorld.action--/HelloWorld.jsp</a>

	<h4>学生注册示例</h4>
	<ul>
		<li><a href="StudentInforCollector001.action">action-1：StudentInforCollector001.action
				--/student/studentInforCollector001.jsp </a></li>
		<li><a href="StudentInforShow001.action">action-2：StudentInforShow001.action
				--actions.StudentInforAction--/student/studentInforShow001.jsp </a></li>
	</ul>
	<h4>action 1示例</h4>
	<p>
		&lt;package name=&quot;root&quot; namespace=&quot;/&quot;
		extends=&quot;struts-default&quot;&gt;<br /> &lt;action
		name=&quot;WelcomeRegister&quot;&gt; &lt;!--第1个Action --&gt;<br />
		&lt;result&gt;/student/studentRegister.jsp&lt;/result&gt;<br />
		&lt;/action&gt;<br /> &lt;action name=&quot;StudentInforShow&quot;
		class=&quot;actions.StudentRegisterAction&quot;&gt; &lt;!--第2个Action
		--&gt;<br /> &lt;result
		name=&quot;success&quot;&gt;/student/studentInforShow.jsp&lt;/result&gt;<br />
		&lt;result
		name=&quot;input&quot;&gt;/student/studentRegister.jsp&lt;/result&gt;<br />
		&lt;/action&gt;<br /> &lt;/package&gt; <br />
	</p>
	<a href="WelcomeRegister01.action">action1：/WelcomeRegister01.action----/student/studentRegister.jsp</a>
	<h4>action2示例</h4>
	<a href="StudentRegInforShow02.action">action2：/StudentRegInforShow02.action--actions.StudentRegisterAction--/student/studentRegInforShow.jsp</a>
	<h4>action3示例</h4>
	<p>
		&lt;package name=&quot;default&quot;
		extends=&quot;struts-default&quot;&gt;<br /> &lt;action
		name=&quot;WelcomeRegister&quot;&gt; &lt;!--第3个Action --&gt;<br />
		&lt;result&gt;/student/studentRegister.jsp&lt;/result&gt;<br />
		&lt;/action&gt;<br /> &lt;/package&gt;<br />
	</p>
	<a href="WelcomeRegister03.action">action3：WelcomeRegister03.action--/student/studentRegister.jsp</a>
	<h4>action4示例</h4>
	<p>
		&lt;package name=&quot;modePack&quot; namespace=&quot;/show&quot;
		extends=&quot;struts-default&quot;&gt;<br /> &lt;action
		name=&quot;StudentInforShow&quot;
		class=&quot;actions.StudentRegisterModelDriverAction&quot;<br />
		method=&quot;oneNewRegister&quot;&gt; &lt;!--第4个Action --&gt;<br />
		&lt;result
		name=&quot;input&quot;&gt;/student/remind.jsp&lt;/result&gt;<br />
		&lt;result
		name=&quot;success&quot;&gt;/student/studentInforShow.jsp&lt;/result&gt;<br />
		&lt;/action&gt;<br /> &lt;/package&gt;<br />
	</p>
	<a href="show/StudentInforShow04.action">action4：/show/StudentInforShow04.action--actions.StudentRegisterModelDriverAction--/student/remind.jsp--/student/studentInforShow04.jsp</a>

</body>
</html>
