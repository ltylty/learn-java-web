<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri ="/struts-tags" prefix ="s" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="<s:url action="DefaultUser-login" namespace="/user" encode="true" includeParams="none" />">
	<table>
	<tr>
		<td>用户名：</td>
		<td>
		<input type="text" name="userName" />
		</td>
	</tr>
	<tr>
		<td>密码：</td>
		<td>
		<input type="password" name="password" />
		</td>
	</tr>
	<tr>
	<td><input type="submit" /></td>
	</tr>
	</table>
</form>
</body>
</html>
