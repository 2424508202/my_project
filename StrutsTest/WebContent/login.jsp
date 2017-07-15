<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>???????</title>
</head>
<body>
<form action="LoginAction.action" method="post">
	用户名：<input type="text" name="name"><s:fielderror name="name"></s:fielderror>
	密码：<input type="password" name="password">
	<input type="submit" value="提交"/>
</form>
</body>
</html>