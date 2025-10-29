package com.demo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public class OrderDaoImpl implements OrderDaoI
{
	static Map<Customer, List<Item>> hm = new HashMap<>();

	@Override
	public boolean save(Customer customer, List<Item> ilist) 
	{
		if(!hm.containsKey(customer))
		{
			hm.put(customer, ilist);
			return true;
		}
		return false;
	}

	@Override
	public Map<Customer, List<Item>> displayAll() 
	{
		
		return hm;
	}

	@Override
	public List<Item> displaybyCustomerId(int cid) 
	{
		for(Customer c : hm.keySet())
		{
			if(c.getCid() == cid)
			{
				return hm.get(c);
			}
		}
		return null;
	}

	@Override
	public boolean deleteCustomerById(int cid) 
	{
		for(Customer c : hm.keySet())
		{
			if(c.getCid() == cid)
			{
				hm.remove(c);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean addNewItemInExixtingOrder(int cid, int iid, String iname, int iqty, double iprice) 
	{
		for(Customer c : hm.keySet())
		{
			if(c.getCid() == cid)
			{
				List<Item> itemlist = hm.get(c);
				
				Item newItem = new Item(iid, iname, iqty, iprice);
				
				itemlist.add(newItem);
				
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteItemInExistingOrder(int cid, int iid) 
	{
		for(Customer c: hm.keySet())
		{
			if(c.getCid() == cid)
			{
				List<Item> itemlist = hm.get(c);
				
				if(itemlist != null)
				{
					for(Item i : itemlist)
					{
						if(i.getIid() == iid)
						{
							itemlist.remove(i);
							return true;
						}
					}
				}
			}
		}
		return false;
	}

}
