<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to User Home Screen</title>
</head>
<body>
<jsp:include page="header.jsp" />
	<h1>User Home</h1>

	<div><a href="${pageContext.request.contextPath}/user/show-kit">Show Kit Details</a></div>
	<br>
	<div><a href="${pageContext.request.contextPath}/user/show-list">View Available Products</a></div>

</body>
</html>