<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="/struts-dojo-tags" prefix="ss"%>
<!DOCTYPE HTML >
<html>
<head>
<title>输入电话号码</title>
</head>
<body>
	<s:form action="showscellphone">
		<s:textfield label="请输入电话号码" name="cellNumber"></s:textfield>
		<s:label value="格式为：国家代码-手机号码" cssStyle="font-size:9px;color:red"></s:label>
		<s:submit value="提交" align="center"></s:submit>
	</s:form>
</body>
</html>
