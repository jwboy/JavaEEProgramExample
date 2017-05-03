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
		<fmt:parseDate value="2014年4月9日 22:33:44"
			pattern="yyyy年MM月dd日 HH:mm:ss" var="d" />
		<fmt:formatDate value="${d}" type="both" />
	</body>
</html>
