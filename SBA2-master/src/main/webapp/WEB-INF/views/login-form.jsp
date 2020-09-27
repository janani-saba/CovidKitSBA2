<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form"
	prefix="spring-form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
	<core:if test="${param.error != null}">
		<i> Please enter valid credentials </i>
	</core:if>

	<spring-form:form action="${pageContext.request.contextPath}/validate" method="POST">
		<br />
		<br />
		<label>Username</label>
		<input type="text" name="username" />
		<br />
		<br />
		<label>Password</label>
		<input type="password" name="password" />
		<br />
		<br />
		<input type="submit" value="Login" />
	</spring-form:form>
	
	<core:if test="${param.logout != null}">
		<i>Logged out successfully</i>
	</core:if>


</body>
</html>