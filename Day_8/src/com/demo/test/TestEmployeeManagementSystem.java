package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeManagementSystem {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		EmployeeService empService = new EmployeeServiceImpl();
		
		int choice = 0;
		
		do 
		{
			System.out.println("1. Add New Employee \n"
							 + "2. Display All \n"
							 + "3. Search by ID \n"
							 + "4. Search by Name \n"
							 + "5. Update Salary \n"
							 + "6. Delete by ID \n"
							 + "7. Deleete by Salary \n"
							 + "8. Sort by Salary \n"
							 + "9. Sort by Name\n"
							 + "10. Exit");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1->
				{
					boolean status = empService.addNewEmployee();
					if(status)
					{
						System.out.println("Added successfully...");
					}
					else
					{
						System.out.println("Failed to add!!!");
					}
				}
				
				case 2->
				{
					List<Employee> emplist = empService.displayAll();
					
					emplist.forEach(System.out::println);
				}
				
				case 3->
				{
					System.out.println("Enter ID: ");
					int id = sc.nextInt();
					
					Employee e = empService.searchById(id);
					
					if(e!=null)
					{
						System.out.println(e);
					}
					else
					{
						System.out.println("Not found");
					}
					
				}
				
				case 4->
				{
					sc.nextLine();
					System.out.println("Enter Name: ");
					String name = sc.nextLine();
					
					List<Employee> emplist = empService.findByName(name);
					if(emplist != null)
					{
						emplist.forEach(System.out::println);
					}
					else
					{
						System.out.println("Not found");
					}
				}
				
				case 5->
				{
					System.out.println("Enter ID: ");
					int id = sc.nextInt();
					
					System.out.println("Enter updated salary: ");
					double salary = sc.nextDouble();
					
					boolean status = empService.updateSalary(id, salary);
					if(status)
					{
						System.out.println("Salary Updated...");
					}
					else
					{
						System.out.println("Failed to update!!!");
					}
				}
				
				case 6->
				{
					System.out.println("Enter ID: ");
					int id = sc.nextInt();
					
					boolean status = empService.deleteById(id);
					if(status)
					{
						System.out.println("Employee Deleted");
					}
					else
					{
						System.out.println("Failed to Deleted");
					}
				}
				
				case 7->
				{
					System.out.println("Enter Salary: ");
					double salary = sc.nextDouble();
					
					boolean status = empService.deleteBySalary(salary);
					if(status)
					{
						System.out.println("Employee Deleted....");
					}
					else
					{
						System.out.println("Not Found");
					}
				}
				
				case 8->
				{
					List<Employee> emplist = empService.sortBySalary();
					
					emplist.forEach(System.out::println);
				}
				
				case 9->
				{
					List<Employee> emplist = empService.sortByName();
					
					emplist.forEach(System.out::println);
				}
				
				case 10->
				{
					System.exit(0);
				}
				
				default ->
				{
					System.out.println("Invalid Choice");
				}
			}
		}
		while(choice != 10);

	}

}
