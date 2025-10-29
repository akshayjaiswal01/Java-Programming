package com.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.demo.beans.Customer;
import com.demo.beans.Item;
import com.demo.dao.OrderDaoI;
import com.demo.dao.OrderDaoImpl;

public class OrderServiceImpl implements OrderServiceI
{
	private OrderDaoI odao;
	
	

	public OrderServiceImpl() {
		super();
		this.odao = new OrderDaoImpl();
	}


	@Override
	public boolean addNewCustomer() 
	{
		Scanner sc = new Scanner(System.in);
		
		// accept customer details
		System.out.println("Enter Customer ID: ");
		int cid = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Customer Name: ");
		String cname = sc.nextLine();
		
		System.out.println("Enter Customer phone number: ");
		String cmob = sc.next();
		
		Customer customer = new Customer(cid, cname, cmob);
		
		// accept list of items
		
		List<Item> ilist = new ArrayList<>();
		String ans = null;
		
		do {
			
			System.out.println("Enter Item ID: ");
			int iid = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter Item Name: ");
			String iname = sc.nextLine();
			
			System.out.println("Enter Item Quantity: ");
			int iqty = sc.nextInt();
			
			System.out.println("Enter Item Price: ");
			double iprice = sc.nextDouble();
			
			Item item = new Item(iid, iname, iqty, iprice);
			
			ilist.add(item);
			
			System.out.println("do you want to add one more item (y/n)? ");
			ans = sc.next();
			
		}while(ans.equals("y"));
		
		return odao.save(customer, ilist);
	}


	@Override
	public Map<Customer, List<Item>> displayAll() 
	{
		
		return odao.displayAll();
	}


	@Override
	public List<Item> displayByCustomerId(int cid) 
	{
		
		return odao.displaybyCustomerId(cid);
	}


	@Override
	public boolean deleteCustomerById(int cid) 
	{
		
		return odao.deleteCustomerById(cid);
	}


	@Override
	public boolean addNewItemInExixtingOrder(int cid, int iid, String iname, int iqty, double iprice) 
	{
		
		return odao.addNewItemInExixtingOrder( cid,  iid,  iname,  iqty,  iprice);
	}


	@Override
	public boolean deleteItemInExistingOrder(int cid, int iid) 
	{
		
		return odao.deleteItemInExistingOrder(cid, iid);
	}

}
