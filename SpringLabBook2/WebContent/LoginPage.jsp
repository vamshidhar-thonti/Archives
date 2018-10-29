<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="login" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
div {
	margin: 100px;
	padding: 25px;
	border: 2px solid gray;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LoginPage</title>
</head>
<body>
	<login:form action="login" method="post" modelAttribute="loginDetails">
		<div>
		<center><h1>Login Page</h1></center>
			<table border="1" align="center">
				<tr>
					<td>User Name</td>
					<td><input type="text" name="username">
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password">
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit"
						value="Login" /></td>
				</tr>
			</table>
		</div>

	</login:form>
</body>
</html>