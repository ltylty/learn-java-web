<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri ="/struts-tags" prefix ="s" %>
<html>
<body>
<h2>Hello World!</h2>
<s:form action="DefaultUser-login.action" namespace="/user" method="post">
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
</s:form>
</body>
</html>
