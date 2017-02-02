<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isErrorPage="true"%>
<%@ taglib prefix="s" uri="/struts-tags"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	  	<script type="text/javascript">
		$(function() {
			$("#exception").hide();
		})
		
		function detail(){
			$("#exception").toggle();
		}
		</script>
	</head>
	<body>
		<h1 align="center">
			<a href="javascript:detail()">系统出现错误，请稍后再试</a>
		</h1>
		
		<div id="exception">
			<s:property value="exceptionStack"/>
		</div>
	</body>
</html>