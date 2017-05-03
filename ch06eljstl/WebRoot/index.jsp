<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>JSTL国际化</title>
	</head>
	<body>
		<fmt:setLocale value="en_US" />
		<fmt:setBundle basename="message" var="msg" />
		<fmt:message key="title" bundle="${msg}" var="title" />
		<fmt:message key="hi" bundle="${msg}" var="hi">
			<fmt:param value="Tom" />
		</fmt:message>

		<h1 align="center">
			${title }
		</h1>
		<h2>
			${hi}
		</h2>
	</body>
</html>
