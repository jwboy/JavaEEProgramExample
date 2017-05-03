<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>JSTL国际化——数值格式化</title>
	</head>
	<body>
		<fmt:setLocale value="zh_CN" />
		<fmt:formatNumber value="123.456" pattern="00000.##" />
		<fmt:parseNumber type="currency" value="￥12,456.77" />
	</body>
</html>
