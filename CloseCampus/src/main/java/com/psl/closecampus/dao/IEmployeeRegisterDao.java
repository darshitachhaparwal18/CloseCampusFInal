package com.psl.closecampus.dao;

import com.psl.closecampus.entity.Employee;
import com.psl.closecampus.entity.PersonViolation;

public interface IEmployeeRegisterDao {
	Employee getEmployee(String mac_addr);
	Employee getViolatedPerson(String mac_addr);
	void addViolatedPerson(PersonViolation personViolation);
	void registerEmployee(Employee employee);
	void sendSmsOnEmployeeNo(Employee employee);
	void sendEmployeeDetailsToAdmin(Employee employee);
}
