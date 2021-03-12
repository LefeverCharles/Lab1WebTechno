<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>You are born after the year 1990</p>
<jsp:useBean id="userInfo" scope="request" type="lab.mvc.model.Person"/>
<jsp:getProperty property="firstName" name="userInfo"/><br>
<jsp:getProperty property="lastName" name="userInfo"/><br>
<jsp:getProperty property="birthDay" name="userInfo"/><br>
<jsp:getProperty property="sex" name="userInfo"/>

</body>
</html>