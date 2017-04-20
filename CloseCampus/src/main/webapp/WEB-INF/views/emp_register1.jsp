<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
  <meta charset="UTF-8">
  <title>Registration</title>
  
  
  <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Open+Sans:600'>
  <link href="https://fonts.googleapis.com/css?family=Lobster+Two" rel="stylesheet">
  <link rel="stylesheet" href="css/style.css">

  
</head>

<body>
  <div class="login-wrap">
	<div class="login-html">
	<header>Closed Campus</header>
	<hr>
	<br/>
	<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Registration</label>
		<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Dashboard</label>
		
		<div class="login-form" >
			<div class="sign-in-htm">
			
				<div class="group">
					<label for="user" class="label">Owner Name</label>
					<input id="user" type="text" class="input">
				</div>
				<div class="group">
					<label for="pass" class="label">Vehicle No</label>
					<input id="pass" type="text" class="input" >
				</div>
				<div class="group">
					<label for="pass" class="label">Mobile No</label>
					<input id="pass" type="text" class="input">
				</div>
				<div class="group">
					<label for="pass" class="label">Mac Address</label>
					<input id="pass" type="text" class="input">
				</div>
				<div class="group">
					<input type="submit" class="button" value="Register">
				</div>
				
			</div>
			<div class="sign-up-htm">
         
              hi i am in dashboard
				
			</div>
		</div>
		
		
		</div>  		
		
	</div>

  
  
</body>
</html>
