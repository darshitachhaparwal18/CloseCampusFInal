package com.psl.closecampus.dao;

import java.io.IOException;

import com.psl.closecampus.entity.Employee;
import com.psl.closecampus.entity.PersonViolation;

public interface IEmployeeRegisterDao {
	Employee getEmployee(String mac_addr);
	Employee getViolatedPerson(String mac_addr);
	void addViolatedPerson(PersonViolation personViolation) throws IOException;
	void registerEmployee(Employee employee);
	void sendSmsOnEmployeeNo(Employee employee);
	void sendEmployeeDetailsToAdmin(Employee employee);
}
