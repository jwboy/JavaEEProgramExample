<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>通告</title>
</head>
<body>
	<form action="NoticeServlet?action=add" method="post">
		<h2>发布通告</h2>
		<p>
			标题：<input type="text" name="title"><br /> 作者：<input
				type="text" name="author"><br /> 联系方式：<input type="text"
				name="phone"><br /> 发布日期：<input type="text"
				name="publictime"><br /> 备注：<input type="text"
				name="linktag"><br />
		</p>
		<p>
			内容：
			<textarea rows="10" cols="80" name="content"></textarea>
		</p>
		<input type="submit" value="提交">
	</form>
</body>
</html>
