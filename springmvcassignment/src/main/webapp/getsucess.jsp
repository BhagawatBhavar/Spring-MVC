<%@page import="com.te.springmvcassignment.employee.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>get your data</h1>
<%Employee id=(Employee) request.getAttribute("id"); %>>
<%=id %>
</body>
</html>