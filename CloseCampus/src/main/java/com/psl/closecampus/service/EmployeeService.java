package com.psl.closecampus.service;

import java.io.IOException;

import com.psl.closecampus.dao.IEmployeeRegisterDao;
import com.psl.closecampus.entity.Employee;
import com.psl.closecampus.entity.PersonViolation;

public class EmployeeService {

	private IEmployeeRegisterDao employeeRegisterDao;

	public IEmployeeRegisterDao getEmployeeRegisterDao() {
		return employeeRegisterDao;
	}

	public void setEmployeeRegisterDao(IEmployeeRegisterDao employeeRegisterDao) {
		this.employeeRegisterDao = employeeRegisterDao;
	}

	public Employee getEmployee(String mac_addr){
		return employeeRegisterDao.getEmployee(mac_addr);
	}
	
	public void registerEmployee(Employee employee) {
		employeeRegisterDao.registerEmployee(employee);
	}

	public void sendSmsOnEmployeeNo(Employee employee) {
		employeeRegisterDao.sendEmployeeDetailsToAdmin(employee);
	}

	public void sendEmployeeDetailsToAdmin(Employee employee) {
		employeeRegisterDao.sendEmployeeDetailsToAdmin(employee);
	}
	public Employee getViolatedPerson(String mac_addr) {
		return employeeRegisterDao.getViolatedPerson(mac_addr);
	}

	public void addViolatedPerson(PersonViolation personViolation) throws IOException{
		employeeRegisterDao.addViolatedPerson(personViolation);
	}


}
