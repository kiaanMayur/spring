package com.cg.controller;

import com.cg.employeedetails.Employee;
import com.cg.employeeservices.EmployeeServices;

public class EmployeeController {
	
	EmployeeServices employeeServices = new EmployeeServices();
	
	public void addEmployee(Employee employee) {
		employeeServices.addEmployee(employee);
	}
	
	public void viewEmployee() {
		employeeServices.viewEmployee();
	}
	
	public Employee getEmployeeById(int id) {
		return employeeServices.getEmployeeById(id);
	}
	
	public void delelteEmployee(int id) {
		employeeServices.deleteEmployee(id);
	}

}
