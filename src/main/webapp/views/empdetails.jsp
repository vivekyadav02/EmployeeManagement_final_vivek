<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css" />

<title>Employee Details</title>
</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	%>

	<header>
		<h3 style="color: black;">Employee Details</h3>
		<p>
		<h4 style="color: black;">${uname}</h4>
		<a href="logout" class="btn btn-info btn-sm"> <span
			class="glyphicon glyphicon-log-out"> </span> Log out
		</a>

		</p>
	</header>
	<br>
	<div class="form-group row">
		<div class="col"></div>
		<div class="col">
			<a class="btn btn-primary btn-lg" href="uploademp" method="post"
				role="button">Upload Employee Details</a> <a
				class="btn btn-primary btn-lg" href="download" role="button">Download
				Employee Details</a>
		</div>
	</div>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th scope="col">Emp Code</th>
				<th scope="col">Emp Name</th>
				<th scope="col">Location .</th>
				<th scope="col">Email .</th>
				<th scope="col">Date of Birth</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${list}">
				<tr>
					<th scope="row">${user.getEmpId()}</th>
					<td>${user.getEmpName()}</td>
					<td>${user.getEmpLocation()}</td>
					<td>${user.getEmail()}</td>
					<td>${user.getDob()}</td>
					<td><a href="edit/${user.getEmpId()}" method="post" />Edit</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<footer>
		<div> </div>
	</footer>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>