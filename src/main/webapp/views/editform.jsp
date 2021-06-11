<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

<title>Edit | Form</title>
</head>
<body>

	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	%>
	<h1 style="text-align: center; color: rgb(102, 204, 255)">Employee
		Edit Registration</h1>
	<br>
	<br>
	<div class="col-md-10" style="padding-left: 300px; width: 800px;">
		<form:form style="text-align: center; width: 700px;" action="/empedit"
			method="post" modelAttribute="emp">
			<div class="form-group row">
				<label for="inputEmail3" class="col-sm-4 col-form-label">Employee
					Code</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" id="inputEmail3"
						name="empId" required>
				</div>
			</div>
			<br>
			<form:errors path="empId" class="heading" />
			<br>
			<div class="form-group row">
				<label for="inputPassword3" class="col-sm-4 col-form-label">Employee
					Name</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" id="inputPassword3"
						name="empName" required>
				</div>
			</div>
			<br>
			<form:errors path="empName" class="heading" />
			<br>
			<div class="form-group row">
				<label for="inputPassword3" class="col-sm-4 col-form-label">Location</label>
				<div class="col-sm-8">
					<select multiple class="form-control" name="empLocation"
						id="exampleFormControlSelect2">
						<option>Gurgao</option>
						<option>Noida</option>
						<option>Kolkata</option>
						<option>Jamshedpur</option>
						<option>Benglore</option>
						<option>dhanbad</option>
					</select>
				</div>
			</div>
			<br>
			<form:errors path="empLocation" class="heading" />
			<br>
			<div class="form-group row">
				<label for="inputPassword3" class="col-sm-4 col-form-label">Email</label>
				<div class="col-sm-8">
					<input type="email" class="form-control" id="inputPassword3"
						name="email" required>
				</div>
			</div>
			<br>
			<form:errors path="email" class="heading" />
			<br>
			<div class="form-group row">
				<label for="inputPassword3" class="col-sm-4 col-form-label">Birth
					of Date</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" id="inputPassword3"
						name="dob" required>
				</div>
			</div>
			<br>
			<form:errors path="dob" class="heading" />
			<br>

			<br>
			<div class="form-group row">
				<div class="col">
					<button type="submit" class="btn btn-primary">Submit</button>
				</div>
				<div class="col">
					<button type="submit" class="btn btn-primary">Cancel</button>
				</div>
			</div>
		</form:form>
	</div>

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