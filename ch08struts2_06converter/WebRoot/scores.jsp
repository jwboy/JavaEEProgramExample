<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="/struts-dojo-tags" prefix="ss"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>输入学生成绩</title>
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
		<s:form theme="simple" action="showscores">
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
					</tr>
				</thead>
				<tbody>
				<s:iterator value="new int[4]" status="st">
					<tr>
						<td>
							<s:textfield name="%{'students['+#st.index+'].name'}">
						    </s:textfield>
						</td>
						<td>
						   <s:textfield name="%{'students['+#st.index+'].number'}">
						   </s:textfield>
						</td>
						<td>
							<s:textfield name="%{'students['+#st.index+'].score.javaScore'}">
						    </s:textfield>
						</td>							
						<td>
						    <s:textfield name="%{'students['+#st.index+'].score.ccScore'}">
						    </s:textfield>
						</td>
						<td>						
						    <s:textfield name="%{'students['+#st.index+'].score.j2eeScore'}">
						   </s:textfield>
						</td>					
					</tr>
					</s:iterator>					
				</tbody>	
				
			</table>
			<s:submit value="提交"></s:submit>
		</s:form>
	</body>
</html>
