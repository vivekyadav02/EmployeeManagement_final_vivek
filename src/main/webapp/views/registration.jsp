<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored="false"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	%>
	<br>
	<br>
	<h2 style="text-align: center" >
		HR Registration <br>Nagarro<br>Registration
	</h2>
	<h3 style="text-align: center; color: red;">${error}</h3>
	<form:form style="width: 820px; height: 900px; padding-left: 400px;"
		action="loginUser" method="post" modelAttribute="hr">
		
		<!-- Name Input -->
		<div class="form-outline mb-4">
			<input type="text" id="form1Example3" class="form-control"
				name="name" required /> <label class="form-label"
				for="form1Example1">Name </label>
		</div>
		<br>
		<form:errors path="name" style="color:red;"/>
		<br>
		
		<!-- Email input -->
		<div class="form-outline mb-4">
			<input type="text" id="form1Example1" class="form-control"
				name="username" required/> <label class="form-label" for="form1Example1"
				>UserName </label>
		</div>
		<br>
		<form:errors path="username" style="color:red;"/>
		<br>
		
		<!-- Password input -->
		<div class="form-outline mb-4">
			<input type="password" id="form1Example2" class="form-control"
				name="password" required /> <label class="form-label" for="form1Example2"
				>Password</label>
		</div>
		<br>
		<form:errors path="password" style="color:red;"/>
		<br>


		<!-- Submit button -->
		<button type="submit" class="btn btn-primary btn-block" value="login">Sign
			in</button>
	</form:form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
		crossorigin="anonymous"></script>
</body>
</html>