<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="/struts-dojo-tags" prefix="ss"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>显示学生成绩</title>

			<s:head theme="xhtml" />
		<ss:head parseContent="true" />


		<style type="text/css">
            table {
	           border-collapse: collapse;
	           border: 1px solid #000;
            }
           th,td {
	            border: 1px solid #000;
           }
       </style>
	</head>

<body>
			<table>
				<thead>
					<tr>
						<th align="center">
							姓名
						</th>
						<th align="center">
							学号
						</th>
						<th align="center">
							Java成绩
						</th>
						<th align="center">
							C语言成绩
						</th>
						<th align="center">
							J2EE成绩
						</th>
						<th align="center">
							平均成绩
						</th>
					</tr>
				</thead>
				<tbody>
				<s:iterator value="students" status="st">
					<tr>
						<td align="center">
							<s:property value="name" />
						</td>
						<td>
						   <s:property value="number" />
						</td>
						<td align="center">
						    <s:property value="score.javaScore" />							
						</td>							
						<td align="center">
						   <s:property value="score.ccScore" />
						</td>
						<td align="center">						
						    <s:property value="score.j2eeScore" />
						</td>
						<td align="center">						
						    <s:property value="score.aveScore" />
						</td>
					</tr>
					</s:iterator>					
				</tbody>	
				
			</table>
	</body>
</html>
