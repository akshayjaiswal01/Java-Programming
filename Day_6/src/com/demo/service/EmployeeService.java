package com.demo.service;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.IdGenerator;
import com.demo.beans.SalariedEmployee;
import com.demo.beans.Vendor;
import java.util.Scanner;

public class EmployeeService 
{
	Scanner sc = new Scanner(System.in);

	public void addNewEmployee(Employee[] employees, int count) 
	{
		
		if(count>=employees.length)
		{
			System.out.println("Employee list is full, Cannot add more employee!!!");
			return ;
		}
		sc.nextLine();
		System.out.println("Enter Employee Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Employee Mobile Number: ");
		String mobile = sc.nextLine();
		
		System.out.println("Enter Employee Email: ");
		String email = sc.nextLine();
		
		System.out.println("Enter Employee Department: ");
		String department = sc.nextLine();
		
		System.out.println("Enter Employee designation: ");
		String designation = sc.nextLine();
		
		System.out.println("Enter Employee dateOfJoining: (dd/mm/yyyy)");
		String dateOfJoining = sc.nextLine();
		
		System.out.println("Select Employee Type: ");
		System.out.println("1. Salaried");
		System.out.println("2. Contract");
		System.out.println("3. Vendor");
		
		System.out.println("Enter type: ");
		int type = sc.nextInt();
		sc.nextLine();
		
		
		int id = IdGenerator.generateEmpId();
		
		Employee emp = null;
		
		switch(type)
		{
		case 1:
			System.out.println("Enter Basic Salary: ");
			double basic = sc.nextDouble();
			emp = new SalariedEmployee(id, name, mobile, email, department, designation, dateOfJoining, basic);
			
			break;
			
		case 2:
			System.out.println("Enter Hourly Worked: ");
			int hourlyWorked = sc.nextInt();
			
			System.out.println("Enter Hourly Rate: ");
			double hourlyRate = sc.nextDouble();
			
			emp = new ContractEmployee(id, name, mobile, email, department, designation, dateOfJoining, hourlyWorked, hourlyRate);
			break;
			
		case 3:
			System.out.println("Enter Number of Employee: ");
			int no = sc.nextInt();
			
			System.out.println("Enter Amount: ");
			double amount = sc.nextDouble();
			
			emp = new Vendor(id, name, mobile, email, department, designation, dateOfJoining, no, amount);
			break;
			
		default :
			System.out.println("Invalid type selected");
			return;
			
		}
		
		employees[count] = emp;
		System.out.println("Employee added successfully....");
		
		
	}

	public void displayEmployeeByType(Employee[] employees, int count) 
	{
		
		System.out.println("Select Employee Type");
		System.out.println("1. Salaried");
		System.out.println("2. Contract");
		System.out.println("3. Vendor"); 
		
		System.out.println("Enter type: ");
		int type = sc.nextInt();
		
		boolean found = false;
		
		for(int i=0; i<count; i++)
		{
			Employee emp = employees[i];
			
			switch(type)
			{
				case 1:
					if(emp instanceof SalariedEmployee)
					{
						System.out.println(emp);
						found = true;
					}
					break;
					
				case 2:
					if(emp instanceof ContractEmployee)
					{
						System.out.println(emp);
						found = true;
					}
					break;
					
				case 3:
					if(emp instanceof Vendor)
					{
						System.out.println(emp);
						found = true;
					}
					break;
					
				default :
					System.out.println("Invalid type selected");
					return;
			}
		}
		
		if(!found)
		{
			System.out.println("No employees found for selected type");
		}
		
	}

	public void searchEmployeeById(Employee[] employees, int count, int id) 
	{
		boolean found = false;
		
		for(int i=0; i<employees.length; i++)
		{
			Employee emp = employees[i];
			if(emp != null)
			{
				if(emp.getId() == id)
				{
					found = true;
					System.out.println(emp);
					return;
				}
			}
		}
		
		if(!found)
		{
			System.out.println("Employee not found");
		}
		
	}

	public void searchEmployeeByName(Employee[] employees, int count, String name) 
	{
		boolean found = false;
		
		for(int i=0; i<employees.length; i++)
		{
			Employee emp = employees[i];
			if(emp != null)
			{
				if(emp.getName().equals(name))
				{
					found = true;
					System.out.println(emp);
					return;
				}
			}
		}
		
		if(!found)
		{
			System.out.println("Employee not found");
		}
		
	}

	public void displayAllEmployee(Employee[] employees, int count) 
	{
		for(Employee e: employees)
		{
			if(e!=null)
			{
				System.out.println(e);
			}
		}
		
	}
	
}
