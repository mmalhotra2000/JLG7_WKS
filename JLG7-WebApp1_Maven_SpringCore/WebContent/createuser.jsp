<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<c:if test="${users != null}">
			<h2>Edit New User</h2>
		</c:if>
		<c:if test="${users == null}">
			<h2>Add New User</h2>
		</c:if>

		<form class="form-horizontal" method="post" action="home.do">

			<div class="form-group">

				<c:if test="${users != null}">
					<input class="form-control" id="id" type="hidden" name="id"
						value="${users.id}">
				</c:if>



				<label class="control-label col-sm-2" for="uname">User Name:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="uname"
						placeholder="Enter user name" name="uname" value="${users.name}">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="email">Email:</label>
				<div class="col-sm-10">
					<input type="email" class="form-control" id="email"
						placeholder="Enter email" name="email" value="${users.email}">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="country">Country
					:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="country"
						placeholder="Enter country" name="country"
						value="${users.country}">
				</div>
			</div>


			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Submit</button>
				</div>
			</div>
		</form>
	</div>

</body>
</html>
