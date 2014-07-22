<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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

<script type="text/javascript">
	var myfrom = document.getElementById("myform1");

	function addSubtype() {
		var myform = document.forms[0];
		myform.action = "testSubtype/addSubtype_success";
		myform.method = "post";
		myform.submit();
	}

	function modifySubtype() {
		var myform = document.forms[0];
		myform.action = "testSubtype/modifySubtype_success";
		myform.method = "post";
		myform.submit();
	}

	function deleteSubtype() {
		var myform = document.forms[0];
		myform.action = "testSubtype/deleteSubtype_success";
		myform.method = "post";
		myform.submit();
	}
</script>

</head>

<body>
	<h2>testSubtype</h2>
	<form id="myform1">
		课程类别细类ID：<input type="text" name="subtype.subtypeid"><br>
		课程类别细类码：<input type="text" name="subtype.subtypecode"><br>
		课程类别细类名：<input type="text" name="subtype.subtypename"><br>
		所属类别：<input type="text" name="subtype.belongtotype"><br>
		是否公共细类：<input type="text" name="subtype.ispublicsubtype"><br>
		开设单位：<input type="text" name="subtype.department"><br>
		<input type="button" name="btnadd" onclick="addSubtype()" value="增加" />
	</form>
	<table>
		<thead>
		<tr>
			<th>课程类别细类码</th>
			<th>课程类别细类名</th>
			<th>所属类别</th>
			<th>是否公共细类</th>
			<th>开设单位</th>
			<th>选择</th>
			<th>操作</th>
		</tr>
		</thead>
		<tbody>
		<s:iterator value="subtypeList" var="subtype">
			<tr>
				<td><s:property value="#subtype.subtypecode" /></td>
				<td><s:property value="#subtype.subtypename" /></td>
				<td><s:property value="#subtype.belongtotype" /></td>
				<td><s:property value="#subtype.ispublicsubtype" /></td>
				<td><s:property value="#subtype.department" /></td>
				<td><input type="checkbox" name="select" value="suntypeid"></td>
				<td><input type="button" name="btnmodify" onclick="modifySubtype()" value="修改" />
				<input type="button" name="btndelete" onclick="deleteSubtype()" value="删除" /></td>
			</tr>
		</s:iterator>
		</tbody>
	</table>

</body>
</html>