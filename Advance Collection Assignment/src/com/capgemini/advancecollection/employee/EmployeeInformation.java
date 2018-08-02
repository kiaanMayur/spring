package com.capgemini.advancecollection.employee;

public class EmployeeInformation {
	
	private int empId;
	private String empName;
	private String designation;
	private int empSalary;
	
	
	public EmployeeInformation(int empId, String empName, String designation, int empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.empSalary = empSalary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
	@Override
	public String toString() {
		return "EmployeeInformation [empId=" + empId + ", empName=" + empName + ", designation=" + designation
				+ ", empSalary=" + empSalary + "]";
	}
	
}
