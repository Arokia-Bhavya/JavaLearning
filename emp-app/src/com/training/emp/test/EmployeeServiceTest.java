package com.training.emp.test;

import java.util.Scanner;
import java.util.Set;

import com.training.emp.exception.EmployeeNotFoundException;
import com.training.emp.model.Employee;
import com.training.emp.service.EmployeeService;
import com.training.emp.service.EmployeeServiceImpl;

public class EmployeeServiceTest {
	public static void main(String[] args) {

		Set<Employee> employeeSet;
		// 1. Create an object for service
		EmployeeService service = new EmployeeServiceImpl();

		System.out.println("Employee Service");

		System.out.println("Find All Employees");
		employeeSet = service.findAll();
		System.out.println(employeeSet);

		System.out.println("Find By Id");
		// 2. Get input to id
		int id = 1;
		try {
			// 3. call findById in service with id as input
			Employee employee = service.findById(id);
			// 4. Print the employee
			System.out.println(employee);
		} catch (EmployeeNotFoundException e) {
			// 5. If emp not found
		}

		System.out.println("Update Id");
		// 1. Create New employee Data to be updated
		Employee updateEmployee = new Employee(1, "ImmanuelMathew");
		try {
			// 2. call the update method in service with input emp obje
			service.update(updateEmployee);
			employeeSet = service.findAll();
			System.out.println(employeeSet);
		} catch (EmployeeNotFoundException e) {

		}

		System.out.println("Adding an employee");
		Employee newEmployee = new Employee(4, "Kavin");
		service.save(newEmployee);
		employeeSet = service.findAll();
		System.out.println(employeeSet);

		System.out.println("Deleting an employee");
		id = 3;
		try {
			service.delete(id);
			employeeSet = service.findAll();
			System.out.println(employeeSet);
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Updating contact for an employee");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the employeeId:");
		int empId=scan.nextInt();
		System.out.println("Enter the contact num:");
		String contact=scan.next();
		try {
			service.updateContact(empId,contact);
			employeeSet = service.findAll();
			System.out.println(employeeSet);
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
		}
		scan.close();
	}

}
