<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" scope="session" class="isep.lab1.bean.Person"/>
<% user.setFirstName(request.getParameter("fname")); %>
<% user.setLastName(request.getParameter("lname")); %>
<% user.setBirthDay(request.getParameter("birthday")); %>
<% user.setSex(request.getParameter("gender")); %>
<jsp:getProperty property="firstName" name="user"/><br>
<jsp:getProperty property="lastName" name="user"/><br>
<jsp:getProperty property="birthDay" name="user"/><br>
<jsp:getProperty property="sex" name="user"/>
</body>
</html>