package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.exception.NegativeSalaryException;

public class EmployeeService {
	
	Employee emp = new Employee();

	public void acceptData() throws NegativeSalaryException 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID:");
		int eid = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Employee Name: ");
		String ename = sc.nextLine();
		
		System.out.println("Enter Empoloyee Salary: ");
		double esalary = sc.nextDouble();
		
		emp.setEid(eid);
		emp.setEname(ename);
		emp.setEsalary(esalary);
		
		
	}
	
}
