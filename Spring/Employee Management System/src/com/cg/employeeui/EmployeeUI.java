package com.cg.employeeui;

import java.util.Scanner;

import com.cg.controller.EmployeeController;
import com.cg.employeedetails.Employee;

public class EmployeeUI {
	
	private int answer;
	Scanner scanner = new Scanner(System.in);
	EmployeeController employeeController = new EmployeeController();
	Employee employee = new Employee();
	
	public void acceptData() {
		
		System.out.println("Enter your choice: \n1.Creater account\n2.Exit\n\n-------------------------------------------------------------------------------------------------");
		int choice = scanner.nextInt();
		
		switch(choice) {
		
		case 1:do {
			
			System.out.println("CREATE ACCOUNT:\nEnter the details below:\n");
			System.out.println("Name: ");
			String name = scanner.next();
			employee.setEmployeeName(name);
			System.out.println("\nEnter the salary: ");
			int salary = scanner.nextInt();
			employee.setSalary(salary);
			System.out.println("\nEnter the designation: ");
			String designation = scanner.next();
			employee.setDesignation(designation);
			
			employeeController.addEmployee(employee);
			System.out.println("Want to enter more: ");
			answer = scanner.nextInt();
		}while(answer > 0);
			
			break;

		case 2:
			System.exit(0);
			
		default:
			System.out.println("Invalid choice:");
		}
	}
	
	public void showData() {
		
		System.out.println("Enter your choice: \n1.Get accound details by Id\\2.View all account\\n4.Exit");
		int choice = scanner.nextInt();
		
		switch(choice) {
		
		case 2:
			System.out.println("VIEW ALL ACCOUNTS: ");
			employeeController.viewEmployee();
			break;
			
		case 1:
			System.out.println("ACCOUNT DETAILS BY ID:\nEnter the id of the employee: ");
			int id = scanner.nextInt();
			System.out.println(employeeController.getEmployeeById(id));
			break;
			
		case 3:
			System.exit(0);
			
		default:
			System.out.println("Invalid choice:");
			
		}
		
	}

}
