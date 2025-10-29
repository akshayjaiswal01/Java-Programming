package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Student;
import com.demo.service.StudentServiceI;
import com.demo.service.StudentServiceImpl;

public class TestStudentManagementSystem {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		StudentServiceI stdService = new StudentServiceImpl();
		
		int choice = 0;
		
		do
		{
			System.out.println("1. Add new Student \n"
							 + "2. Display All Student \n"
							 + "3. Serach by ID \n"
							 + "4. Search by Name \n"
							 + "5. Update Marks 1 \n"
							 + "6. Update Marks 2 \n"
							 + "7. Delete by ID \n"
							 + "8. Delete by Name \n"
							 + "9. Sort by ID \n"
							 + "10. Sort by Name \n"
							 + "11. Exit ");
	
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1->
				{
					boolean status = stdService.addNewStudent();
					if(status)
					{
						System.out.println("Student added successfully");
					}
					else
					{
						System.out.println("Failed to add");
					}
				}
				case 2->
				{
					Set<Student> stdset = stdService.displayAll();
					stdset.forEach(System.out::println);
				}
				case 3->
				{
					System.out.println("Enter ID: ");
					int id = sc.nextInt();
					
					Student std = stdService.findById(id);
					if(std != null)
					{
						System.out.println(std);
					}
					else
					{
						System.out.println("Not Found");
					}
					
				}
				case 4->
				{
					sc.nextLine();
					System.out.println("Enter Name: ");
					String name = sc.nextLine();
					
					Set<Student> std = stdService.findByName(name);
					if(std.size() > 0)
					{
						std.forEach(System.out::println);
					}
					else
					{
						System.out.println("Not found");
					}
					
				}
				case 5->
				{
					System.out.println("ENter ID: ");
					int id = sc.nextInt();
					
					System.out.println("Enter Updated Marks 1: ");
					float m1 = sc.nextFloat();
					
					boolean status = stdService.updateMarks1(id, m1);
					if(status)
					{
						System.out.println("Updated successfully");
					}
					else
					{
						System.out.println("Not found");
					}
				}
				case 6->
				{
					System.out.println("ENter ID: ");
					int id = sc.nextInt();
					
					System.out.println("Enter Updated Marks 2: ");
					float m2 = sc.nextFloat();
					
					boolean status = stdService.updateMarks2(id, m2);
					if(status)
					{
						System.out.println("Updated successfully");
					}
					else
					{
						System.out.println("Not found");
					}
				}
				case 7->
				{
					System.out.println("Enter ID: ");
					int id = sc.nextInt();
					
					boolean status = stdService.rempveById(id);
					if(status)
					{
						System.out.println("Deleted succecssfully");
					}
					else
					{
						System.out.println("Not found");
					}
				}
				case 8->
				{
					sc.nextLine();
					System.out.println("Enter Name: ");
					String name = sc.nextLine();
					
					boolean status = stdService.rempveByName(name);
					if(status)
					{
						System.out.println("Deleted succecssfully");
					}
					else
					{
						System.out.println("Not found");
					}
				}
				case 9->
				{
					Set<Student> std = stdService.sortById();
					std.forEach(System.out::println);
				}
				case 10->
				{
					List<Student> std = stdService.sortByName();
					std.forEach(System.out::println);
				}
				case 11->
				{
					System.exit(0);
				}
				default->
				{
					System.out.println("Invalid Choice");
				}
			}
			
		}
		while(choice != 11);

	}

}
