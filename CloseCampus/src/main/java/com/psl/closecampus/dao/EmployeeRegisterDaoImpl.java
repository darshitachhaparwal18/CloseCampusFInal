package com.psl.closecampus.dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient;
import com.psl.closecampus.emailservice.PostManImpl;
import com.psl.closecampus.entity.Employee;
import com.psl.closecampus.entity.PersonViolation;

public class EmployeeRegisterDaoImpl implements IEmployeeRegisterDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public Employee getEmployee(String mac_addr) {
		
	
		return jdbcTemplate.queryForObject("select * from person where mac_addr='"+mac_addr+"'", new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int arg1)
					throws SQLException {
				Employee employee = new Employee();
				employee.setMac_addr(rs.getString(1));
				employee.setOwner_name(rs.getString(2));
				employee.setVehicle_no(rs.getString(3));
				employee.setMob_no(rs.getString(4));
				
				return employee;
			}
			
		});
	}

	@Override
	public void registerEmployee(Employee employee) {
		String sql = "insert into person values('"+employee.getMac_addr()+"','"+employee.getOwner_name()+"','"+employee.getVehicle_no()+"','"+employee.getMob_no()+"')";
		jdbcTemplate.update(sql);
		System.out.println("Employee Registered Successfully");
	}

	@Override
	public void sendSmsOnEmployeeNo(Employee employee) {
		
	}

	@Override
	public void sendEmployeeDetailsToAdmin(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getViolatedPerson(String mac_addr) {
		return jdbcTemplate.queryForObject("select * from person where mac_addr='"+mac_addr+"'", new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int arg1)
					throws SQLException {
				Employee emp = new Employee();
				emp.setMac_addr(rs.getString(1));
				emp.setOwner_name(rs.getString(2));
				emp.setVehicle_no(rs.getString(3));
				emp.setMob_no(rs.getString(3));
				return emp;
			}
			
		});
		
	}

	@Override
	public void addViolatedPerson(PersonViolation personViolation) throws IOException {
		System.out.println("Gonna add record into db");
		String sql = "insert into person_violation_details values('"+personViolation.getMac_addr()+"',sysdate())";
		jdbcTemplate.update(sql);
		System.out.println("Record Added");
		PostManImpl postManImpl = new PostManImpl(createSimpleEmailService());
		System.out.println("Postman Service");
		postManImpl.withFrom("patilsurendra16@gmail.com").withTo("prem.kamal300@gmail.com").withSubject("Closed Campus Test Mail").withBody("Violated Person added \n Mac address : "+personViolation.getMac_addr()+"\n Entry Time : "+personViolation.getMac_addr()).send();
		System.out.println("Violated Person inserted");
	}

	private AWSCredentials createCredentials() throws IOException{
		
		Properties properties = new Properties();
		properties.load(getClass().getClassLoader().getResourceAsStream("aws.properties"));
		System.out.println(properties.getProperty("aws.accessKey"));
		AWSCredentials awsCredentials = new BasicAWSCredentials("Administrator","u7zwYrT6XCU");
		//properties.getProperty(Administr), properties.getProperty("aws.secretKey"
		return awsCredentials;
	}
	
	
	private AmazonSimpleEmailService createSimpleEmailService() throws IOException{
		return new AmazonSimpleEmailServiceClient(createCredentials());
	}

}
