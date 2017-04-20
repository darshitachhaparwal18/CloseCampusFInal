<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Admin Login</title>
  
  <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Open+Sans:600'>
  <link href="https://fonts.googleapis.com/css?family=Lobster+Two" rel="stylesheet">
  <link href="<s:url value='/resources/css/style.css'/>"  rel="stylesheet" type="text/css"/>
 <script type=text/javascript>
function validate(){
	
	var uname=document.getElementById("user").value;
	var pwd=document.getElementById("pass").value;
	if(uname=="root" && pwd=="root")
	{
		window.location.href="http://localhost:8080/CloseCampus/emp_register2";
	}
	else
	{
		alert("Invalid username or password");
	}
} 
</script>
  </head>

<body>
  <div class="login-wrap">
  
	<div class="login-html">
	<header>Closed Campus</header>
	<hr>
	<br/>
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label class="tab">Sign In</label>
		<div class="login-form">
			<div class="sign-in-htm1">
		
				<div class="group">
					<label for="user" class="label">Username</label>
					<input id="user" type="text" class="input">
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input id="pass" type="password" class="input" data-type="password">
				</div>
				<div class="group">
					<input id="check" type="checkbox" class="check" checked>
					<label for="check"><span class="icon"></span> Keep me Signed in</label>
				</div>
				<div class="group">
					<input type="submit" class="button" value="Sign In" onclick="javascript:validate()">
				</div>
			
			</div>
			
		</div>
	</div>
</div>

 
</body>
</html>
