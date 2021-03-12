<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
java.util.Date date = new java.util.Date();
String siteIP = request.getRemoteHost();

%>
<p> Date : <%= date %></p>
<p> Website IP : <%= siteIP %></p>
</body>
</html>