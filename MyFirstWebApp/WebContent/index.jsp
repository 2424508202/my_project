<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>???????</title>
</head>
<body>
 <h1>This is web </h1>
 <%!
 	String s="张三";
 	int add(int x,int y){
 		return x+y;
 	}
 %>
 <%
 	out.print("欢迎");               
 %>
 <br>
 你好，<%=s %><br>
3+5=<%=add(3,5) %>
</body>
</html>