<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<sf:form method="POST" modelAttribute="employee" commandName="employee">
		<table>
			<tr>
				<td><sf:label path="mac_addr">Enter Mac Address : </sf:label></td>
				<td><sf:input path="mac_addr" /></td>
			</tr>
			<tr>
				<td><sf:label path="owner_name">Enter Owner name : </sf:label></td>
				<td><sf:input path="owner_name" /></td>
			</tr>
			<tr>
				<td><sf:label path="vehicle_no">Enter Vehicle No : </sf:label></td>
				<td><sf:input path="vehicle_no" /></td>
			</tr>
			<tr>
				<td><sf:label path="mob_no">Enter Mobile No : </sf:label></td>
				<td><sf:input path="mob_no" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"> 
			</tr>
		</table>
	</sf:form>

</body>
</html>