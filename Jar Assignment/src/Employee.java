
public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String domain;
	private double salary;
	
	//C'tor with arguments
	public Employee(int employeeId, String employeeName, String domain, double salary) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.domain = domain;
		this.salary = salary;
	}
	
	//to print the information of the employee
	public void information() {
		
		System.out.println("Employee Id: " + employeeId + "\nEmployee Name: " + employeeName);
		System.out.println("Domain: " + domain + "\nSalary: " + salary);
	}
	
	

}
