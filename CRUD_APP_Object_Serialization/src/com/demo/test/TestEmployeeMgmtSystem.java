package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeServiceI;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeMgmtSystem {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		EmployeeServiceI eservice = new EmployeeServiceImpl();
		
		eservice.readFile("empdata.txt");
		
		int choice = 0;
		
		do {
			System.out.println("1. Add new Employee \n"
							 + "2. Delete by ID \n"
							 + "3. Modify Salary by ID \n"
							 + "4. Display All \n"
							 + "5. Display by id \n"
							 + "6. Exit \n");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1 ->
				{
					boolean status = eservice.addNewEmployee();
					if(status)
					{
						System.out.println("Added successfully");
					}
					else
					{
						System.out.println("Failed to add");
					}
				}
				case 2 ->
				{
					System.out.println("Enter Employee ID: ");
					int eid = sc.nextInt();
					
					boolean status = eservice.deleteById(eid);
					if(status)
					{
						System.out.println("Deleted successfully");
					}
					else
					{
						System.out.println("not found");
					}
				}
				case 3 ->
				{
					System.out.println("Enter Employee ID: ");
					int eid = sc.nextInt();
					
					System.out.println("Enter Updated Employee Salary: ");
					double salary = sc.nextDouble();
					
					boolean status = eservice.modifySalarybyId(eid, salary);
					if(status)
					{
						System.out.println("Salary updated");
					}
					else
					{
						System.out.println("not found");
					}
				}
				case 4 ->
				{
					List<Employee> elist = eservice.displayAll();
					elist.forEach(System.out::println);
				}
				case 5 ->
				{
					System.out.println("Enter Employee ID: ");
					int eid = sc.nextInt();
					
					Employee emp = eservice.displayById(eid);
					System.out.println(emp);
				}
				case 6 ->
				{
					eservice.saveFile("empdata.txt");
					sc.close();
					System.out.println("Thnak You...");
					System.exit(0);
				}
			}
			
			
		}while(choice != 6);

	}

}
