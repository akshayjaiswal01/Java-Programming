package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public interface OrderServiceI 
{

	boolean addNewCustomer();

	Map<Customer, List<Item>> displayAll();

	List<Item> displayByCustomerId(int cid);

	boolean deleteCustomerById(int cid);

	boolean addNewItemInExixtingOrder(int cid, int iid, String iname, int iqty, double iprice);

	boolean deleteItemInExistingOrder(int cid, int iid);

}
