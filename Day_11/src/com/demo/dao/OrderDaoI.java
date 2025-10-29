package com.demo.dao;

import java.util.List;
import java.util.Map;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public interface OrderDaoI 
{

	boolean save(Customer customer, List<Item> ilist);

	Map<Customer, List<Item>> displayAll();

	List<Item> displaybyCustomerId(int cid);

	boolean deleteCustomerById(int cid);

	boolean addNewItemInExixtingOrder(int cid, int iid, String iname, int iqty, double iprice);

	boolean deleteItemInExistingOrder(int cid, int iid);

}
