<%@taglib uri="/struts-tags" prefix="s"%><%@ page language="java"
	import="java.util.*" pageEncoding="UTF-8"%>
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

<title>My JSP 'success.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<table align="center" border="1" style="width:80%;">
		<tr>
			<th colspan="9" align="center">Book</th>
		</tr>
		<tr>
			<td>Title</td>
			<td>ISBN</td>
			<td>AuthorID</td>
			<td>Price</td>
			<td>Publisher</td>
			<td>PublishDate</td>
		</tr>
		<s:iterator value="booklist">
			<tr>
				<td><a href="bookget.action?BookID=${ISBN}"><s:property value="Title" /></a></td>
				<td><s:property value="ISBN" /></td>
				<td><s:property value="AuthorID" /></td>
				<td><s:property value="Price" /></td>
				<td><s:property value="Publisher" /></td>
				<td><s:property value="PublishDate" /></td>
				
			</tr>
		</s:iterator>
	</table>
</body>
</html>
