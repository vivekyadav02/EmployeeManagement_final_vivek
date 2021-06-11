<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/style.css" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Login | Registration</title>
</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	%>
	
	

    <header>
        <h2>HR Login Form <a href="register" class="btn btn-primary  active" role="button"
			aria-pressed="true"> New User</a></h2>
    </header>
    <div class="container">
        <span>Login</span>
        <div class="col-sm section column">
        <form:form style="width: 820px; height: 900px; padding-left: 400px;"
		action="signUp" method="post" modelAttribute="hr" class="registerform">
         
              <div class="form-group row td">
                <label for="userid" class="col-sm-2 col-form-label">UserId:</label>
                <div class="col-sm-7">
                  <input type="text" class="form-control textfield" id="userid" name="username" minlength="5" maxlength="50"  placeholder="Enter your user id" required/>
                </div>
              </div>
  				<br>
		<form:errors path="username" class="heading"/>
		<br>
              <div class="form-group row td">
                <label for="password" class="col-sm-2 col-form-label">Password:</label>
                <div class="col-sm-7">
                  <input type="password" class="form-control textfield" name="password" id="password" minlength="5" maxlength="50" placeholder="Enter your password">
                </div>
              </div>
              <br>
				<form:errors path="password" class="heading"/>
				<br>
              <div class="form-group row td">
                <div class="col-sm-2.5 button">
                  
      			<button type="submit" name="button1" id="bt1" class="btn ">Login</button>
                </div>
              </div>
            </form:form>
            
        </div>
    </div>
    
    <footer>
        <div >Footer</div>
    </footer>

 


	
	<%-- 
	
		<!-- Email input -->
		<div class="form-outline mb-4">
			<input type="text" id="form1Example1" class="form-control"
				name="username" required /> <label class="form-label"
				for="form1Example1">UserName </label>
		</div><br>
		<form:errors path="username" class="heading"/>
		<br>
		
		<!-- Password input -->
		<div class="form-outline mb-4">
			<input type="password" id="form1Example2" class="form-control"
				name="password" required /> <label class="form-label"
				for="form1Example2">Password</label>
		</div>
		<br>
		<form:errors path="password" class="heading"/>
		<br>

		<!-- Submit button -->
		<button type="submit" class="btn btn-primary btn-block" value="login">Sign
			in</button>
		<a href="register" class="btn btn-primary  active" role="button"
			aria-pressed="true"> New User</a>
	</form:form> --%>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
		crossorigin="anonymous"></script>
</body>
</html>