<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>

<link rel='stylesheet prefetch'
	href='http://fonts.googleapis.com/css?family=Open+Sans:600'>
<link href="https://fonts.googleapis.com/css?family=Lobster+Two"
	rel="stylesheet">
<link href="<s:url value='/resources/css/style.css'/>" rel="stylesheet"
	type="text/css" />

</head>
<body>

	<div class="login-wrap">
		<div class="login-html">
			<header>Closed Campus</header>
			<hr>
			<br /> <input id="tab-1" type="radio" name="tab" class="sign-in"
				checked><label for="tab-1" class="tab">Registration</label>
			<input id="tab-2" type="radio" name="tab" class="sign-up"><label
				for="tab-2" class="tab">Dashboard</label>
			
			<div class="login-form">
				<sf:form method="POST" modelAttribute="employee"
					commandName="employee">
					<div class="sign-in-htm">

						<div class="group">
							<sf:label path="owner_name" class="label" for="user">Enter Owner name : </sf:label>
							<sf:input path="owner_name" class="input" id="user"
								required="true" />

						</div>
						<div class="group">
							<sf:label path="vehicle_no" for="pass" class="label">Enter Vehicle No : </sf:label>
							<sf:input path="vehicle_no" id="pass" class="input"
								required="true" />

						</div>
						<div class="group">
							<sf:label path="mob_no" for="pass1" class="label">Enter Mobile No : </sf:label>
							</td>
							<td><sf:input path="mob_no" id="pass1" class="input"
									required="true" />
						</div>
						<div class="group">
							<sf:label path="mac_addr" for="pass2" class="label">Enter Mac Address : </sf:label>
							<sf:input path="mac_addr" id="pass2" class="input"
								required="true" />

						</div>
						<div class="group">
							<input type="submit" class="button" value="Register">
						</div>

					</div>
				</sf:form>
				<div class="sign-up-htm">

					
					<a href="http://localhost:8080/CloseCampus/Table"><h3>Registered User</h3></a><br><br>
					<a href="http://localhost:8080/CloseCampus/vlist"><h3>Violated User</h3></a>
					
				
				</div>
				
			</div>


		</div>

	</div>




</body>
</html>