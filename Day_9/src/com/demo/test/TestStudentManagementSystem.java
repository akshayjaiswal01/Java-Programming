package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.StudentServiceI;
import com.demo.service.StudentServiceImpl;

public class TestStudentManagementSystem {

	public static void main(String[] args) 
	{
		StudentServiceI stdService = new StudentServiceImpl();
		
		Scanner sc = new Scanner(System.in);
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
							 + "9. Sort by Average Marks \n"
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
					List<Student> stdlist = stdService.displayAll();
					stdlist.forEach(System.out::println);
					
				}
				
				case 3->
				{
					System.out.println("Enter ID: ");
					int id = sc.nextInt();
					
					Student std = stdService.searchById(id);
					if(std != null)
					{
						System.out.println(std);
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
					
					List<Student> stdlist = stdService.searchByName(name);
					
					stdlist.forEach(System.out::println);
					
					
				}
				
				case 5->
				{
					System.out.println("Enter ID: ");
					int id = sc.nextInt();
					
					System.out.println("Enter updated marks 1: ");
					float m1 = sc.nextFloat();
					
					boolean status = stdService.updateMarks1(id, m1);
					if(status)
					{
						System.out.println("marks 1 updated successfully");
					}
					else
					{
						System.out.println("Not found");
					}
				}
				
				case 6->
				{
					System.out.println("Enter ID: ");
					int id = sc.nextInt();
					
					System.out.println("Enter updated marks 2: ");
					float m2 = sc.nextFloat();
					
					boolean status = stdService.updateMarks2(id, m2);
					if(status)
					{
						System.out.println("marks 2 updated successfully");
					}
					else
					{
						System.out.println("Not found");
					}
				}
				
				case 7->
				{
					System.out.println("ENter ID");
					int id =sc.nextInt();
					
					boolean status = stdService.deleteById(id);
					if(status)
					{
						System.out.println("Deleted Successfully");
					}
					else
					{
						System.out.println("not found.!!!");
					}
					
				}
			}
		}
		
		while(choice!=11);

	}

}
