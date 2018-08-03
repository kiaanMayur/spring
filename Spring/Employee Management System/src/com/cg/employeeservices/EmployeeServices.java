package com.cg.employeeservices;

import com.cg.dao.EmployeeDAO;
import com.cg.employeedetails.Employee;

public class EmployeeServices {
	
	EmployeeDAO employeeDao = new EmployeeDAO();
	
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
	}
	
	public void viewEmployee() {
		employeeDao.viewAllEmployee();
	}
	
	public Employee getEmployeeById(int id) {
		return employeeDao.getEmployeeById(id);
	}
	
	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);
	}

}
