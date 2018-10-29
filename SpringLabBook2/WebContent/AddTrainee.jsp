<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="add" uri="http://www.springframework.org/tags/form"%>
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
<title>Insert title here</title>
</head>
<body>
	<add:form action="adding" method="post" modelAttribute="add1">
		<div>
			<center>
				<h1>Enter Trainee Details</h1>
			</center>
			<table align="center">
				<tr>
					<td>Trainee ID</td>
					<td><add:input path="traineeId"/>
				</tr>
				<tr>
					<td>Trainee Name</td>
					<td><add:input path="traineeName"/></td>
				</tr>
				<tr>
					<td>Trainee Domain</td>
					<td><add:select path="traineeDomain" items="${domain}"></add:select></td>
				</tr>
				<tr>
					<td>Trainee Location</td>
					<td><add:radiobutton path="traineeLocation" value="Chennai"/>Chennai
						<add:radiobutton path="traineeLocation" value="Pune"/>Pune
						<add:radiobutton path="traineeLocation" value="Bangalore"/>Bangalore
						<add:radiobutton path="traineeLocation" value="Mumbai"/>Mumbai</td>
				</tr>
				<tr>
					<td><input type="submit" value="Add Trainee"/></td>
				</tr>
			</table>
		</div>

	</add:form>
</body>
</html>