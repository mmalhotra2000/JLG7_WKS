<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome home</h1>


	<a href="home.do">Add New User</a> &nbsp

	<br>

	<table>
		<tr>
			<th>Id</th>
			<th>User name</th>
			<th>Email</th>
			<th>Country</th>
			<th><b>Actions</b></th>
		</tr>

		<c:forEach items="${userlist}" var="users">

			<tr>
				<td>${users.id}</td>
				<td>${users.name}</td>
				<td>${users.email}</td>
				<td>${users.country}</td>
				<td><a href="home.do?id=${users.id}">Edit</a>Delete
				<td>
			</tr>

		</c:forEach>

	</table>


</body>
</html>