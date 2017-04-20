package com.psl.closecampus.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

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
	public void addViolatedPerson(PersonViolation personViolation) {
		String sql = "insert into person_violation_details values('"+personViolation.getMac_addr()+"','"+personViolation.getEntry_time()+"')";
		jdbcTemplate.update(sql);
		System.out.println("Violated Person inserted");
	}

	

}
