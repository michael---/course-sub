<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Subtype List</title>
<style type="text/css">
table {
	border: 1px solid black;
	border-collapse: collapse;
}

table thead tr th {
	border: 1px solid black;
	padding: 3px;
	background-color: #cccccc;
}

table tbody tr td {
	border: 1px solid black;
	padding: 3px;
}
</style>

</head>
<body>
	<h2>Subtype List</h2>
	<s:form action="Remove" theme="simple">
		<table cellspacing="0">
			<thead>
				<tr>
					<th>选择</th>
					<th>课程类别细类ID</th>
					<th>课程类别细类码</th>
					<th>课程类别细类名</th>
					<th>所属类别</th>
					<th>是否公共细类</th>
					<th>开设单位</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="subtypeList">
					<tr>
						<td><input type="checkbox" name="id" value='<s:property value="id" />' /></td>
						<td><s:property value="id" /></td>
						<td><s:property value="subtypecode" /></td>
						<td><s:property value="subtypename" /></td>
						<td><s:property value="belongtotype" /></td>
						<td><s:property value="ispublicsubtype" /></td>
						<td><s:property value="department" /></td>
						<td><a href="security/license!findById?id=<s:property value='id'/>" >修改</a> &nbsp;
     					<a href="security/license!deleteSubtype?id=<s:property value='id'/>" onclick="return confirm('确认删除?')">删除</a></td>
						
					</tr>
				</s:iterator>
			</tbody>
		</table>
		<s:submit value="Delete" />
		<a href="Edit.jsp">Add Subtype</a>
	</s:form>
</body>
</html>