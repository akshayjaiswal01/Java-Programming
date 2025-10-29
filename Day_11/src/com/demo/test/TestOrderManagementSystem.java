package com.demo.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Customer;
import com.demo.beans.Item;
import com.demo.service.OrderServiceI;
import com.demo.service.OrderServiceImpl;

public class TestOrderManagementSystem {

	public static void main(String[] args) 
	{
		OrderServiceI oservice = new OrderServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;;
		
		do {
			
			System.out.println("1. Add new Customer \n"
							 + "2. Display All \n"
							 + "3. Display by Customer ID \n"
							 + "4. Delete Customer By ID \n"
							 + "5. Add new item in existing order \n"
							 + "6. Delete item from existing order \n"
							 + "7. Exit \n");
			
			System.out.println("Enter Your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1->
				{
					boolean status = oservice.addNewCustomer();
					if(status)
					{
						System.out.println("Customer Added successfully");
					}
					else
					{
						System.out.println("Failed to add");
					}
				}
				case 2->
				{
					Map<Customer, List<Item>> omap = oservice.displayAll();
					Set<Customer> keys = omap.keySet();
					keys.forEach(c -> System.out.println(c + "--->"+ omap.get(c)));
				}
				case 3->
				{
					System.out.println("Enter Customer ID: ");
					int cid = sc.nextInt();
					
					List<Item> lst = oservice.displayByCustomerId(cid);
					if(lst != null)
					{
						lst.forEach(System.out::println);
					}
					else
					{
						System.out.println("Not found");
					}
				}
				case 4->
				{
					System.out.println("Enter Customer ID: ");
					int cid = sc.nextInt();
					
					boolean status = oservice.deleteCustomerById(cid);
					if(status)
					{
						System.out.println("Customer deleted successfully");
					}
					else
					{
						System.out.println("Not found");
					}
				}
				case 5->
				{
					System.out.println("Enter Customer ID: ");
					int cid = sc.nextInt();
					
					System.out.println("Enter Item ID: ");
					int iid = sc.nextInt();
					
					sc.nextLine();
					System.out.println("Enter Item Name: ");
					String iname = sc.nextLine();
					
					System.out.println("Enter Item Quantity: ");
					int iqty = sc.nextInt();
					
					System.out.println("Enter Item Price: ");
					double iprice = sc.nextDouble();
					
					boolean status = oservice.addNewItemInExixtingOrder(cid, iid, iname, iqty, iprice);
					if(status)
					{
						System.out.println("Item added successfully");
					}
					else
					{
						System.out.println("Not found");
					}
				}
				case 6->
				{
					System.out.println("Enter Customer name: ");
					int cid = sc.nextInt();
					
					System.out.println("Enter Item Id to delete: ");
					int iid = sc.nextInt();
					
					boolean status = oservice.deleteItemInExistingOrder(cid, iid);
					if(status)
					{
						System.out.println("Item Deleted Successfully");
					}
					else
					{
						System.out.println("Nopt found");
					}
				}
				case 7->
				{
					System.exit(0);
				}
			}
			
		}
		while(choice != 7);
		

	}

}
