<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="/struts-dojo-tags" prefix="ss"%>
<!DOCTYPE HTML>
<html>
<head>
<title>学生信息注册</title>
<s:head theme="xhtml" />
<ss:head parseContent="true" />
<style type="text/css">
table {
	border-collapse: collapse;
	border: 1px solid #000;
}

th, td {
	border: 1px solid #000;
}
</style>
</head>
<body>
	<s:form theme="simple">
		<table>
			<thead>
				<tr>
					<th colspan="5" align="center">学生信息注册</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td style="text-align: right;">姓名：</td>
					<td><s:textfield></s:textfield></td>
				</tr>
				<tr>
					<td style="text-align: right;">生日：</td>
					<td><ss:datetimepicker /></td>
				</tr>

				<tr>
					<td style="text-align: right;">上传照片：</td>
					<td><s:file label="上传照片"></s:file></td>
				</tr>
				<tr>
					<td style="text-align: right;">自我介绍</td>
					<td><s:textarea name="about"></s:textarea></td>
				</tr>
			</tbody>
		</table>
	</s:form>
</body>
</html>
