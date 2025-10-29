package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;

public class TestEmployeeService 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Employee [] employees = new Employee[50];
		int count = 0;
		
		EmployeeService empService = new EmployeeService();
		
		int choice = 0;
		
		while (true) 
		{
			System.out.println("1. Add Employees");
            System.out.println("2. Display Employees by Type");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Search Employee by Name");
            System.out.println("5. Display All Employees");
            System.out.println("6. Calculate Salary by Designation");
            System.out.println("7. Display 5 Employees by Department");
            System.out.println("8. Exit");

            System.out.println("Enter Your choice: ");
            choice = sc.nextInt();
            
            
            switch (choice) 
            {
                case 1: 
                	empService.addNewEmployee(employees, count);
                	count++;
                	break;
                case 2:
                	empService.displayEmployeeByType(employees, count);
                	break;
                case 3: 
                	System.out.println("Enter Employee ID: ");
                	int id = sc.nextInt();
                	
                	empService.searchEmployeeById(employees, count, id);
                	break;
                case 4: 
                	sc.nextLine();
                	System.out.println("Enter Employee Name: ");
                	String name = sc.nextLine();
                	empService.searchEmployeeByName(employees, count, name);
                	break;
                case 5: 
                	empService.displayAllEmployee(employees, count);
                	break;
                case 6: 
                	
                	break;
                case 7: 
                	break;
                case 8: System.exit(0);
            }
        }

	}

}
