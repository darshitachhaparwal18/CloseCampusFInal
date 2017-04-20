<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#6a6f8c">
<center><h1>Registered Employees</h1></center>

<div style="height:600px;overflow:auto;">
	 <%@page language="java"%>
					<%@page import="java.sql.*"%> 
					 <table border="1" align="center">
					<tr>
						<th>Mac Address</th>
						<th>Owner Name</th>
						<th>Vehicle No</th>
						<th>Mobile No</th>
					</tr>
						<%
							try {
								Class.forName("com.mysql.jdbc.Driver").newInstance();
								Connection conn = DriverManager.getConnection(
										"jdbc:mysql://localhost:3307/closecampusdb", "root", "root");
								String query = "select * from person";
								Statement st = conn.createStatement();
								ResultSet rs = st.executeQuery(query);
								
								while (rs.next()) {
						%>
						<tr>
							<td><input type="text" name="mac_addr"
								value="<%=rs.getString(1)%>"></td>
						
							<td><input type="text" name="owner_name"
								value="<%=rs.getString(2)%>"></td>
						
							<td><input type="text" name="vehicle_no"
								value="<%=rs.getString(3)%>"></td>
						
							<td><input type="text" name="mob_no"
								value="<%=rs.getString(4)%>"></td>
						</tr>
						<%
}
}
catch(Exception e){}
%>
					</table> </div>
</body>
</html>