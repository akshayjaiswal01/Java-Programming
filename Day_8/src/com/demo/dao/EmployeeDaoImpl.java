package com.demo.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao
{
	static List<Employee> emplist = new ArrayList<>();;

	@Override
	public boolean save(Employee e) 
	{
		emplist.add(e);
		return true;
	}

	@Override
	public List<Employee> findAll() 
	{
		return emplist;
	}

	@Override
	public Employee findbyId(int id) 
	{
		int pos = emplist.indexOf(new Employee(id));
		if(pos != -1)
		{
			return emplist.get(pos);
		}
		return null;
	}

	@Override
	public boolean removeById(int id) 
	{
		return emplist.remove(new Employee(id));
	}

	@Override
	public List<Employee> findByName(String name) 
	{
		List<Employee> temp = new ArrayList<>();
		for(Employee emp : emplist)
		{
			if(emp.getName().equals(name))
			{
				temp.add(emp);
			}
		}
		
		if(temp.size()>0)
		{
			return temp;
		}
		
		return null;
	}

	@Override
	public boolean changeSalary(int id, double salary) 
	{
		int pos = emplist.indexOf(new Employee(id));
		if(pos != -1)
		{
			emplist.get(pos).setSalary(salary);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteBySalary(double salary) 
	{
		return emplist.removeIf(emp -> emp.getSalary()>salary);
	}

	@Override
	public List<Employee> sortBySalary() 
	{
		List<Employee> templist = new ArrayList<>();
		
		for(Employee e: emplist)
		{
			templist.add(e);
		}
		
		Comparator<Employee> c = (obj1, obj2)->{
			
			return (int) (obj1.getSalary() - obj2.getSalary());
			
		};
		templist.sort(c);
		return templist;
	}

	@Override
	public List<Employee> sortByName() 
	{
		List<Employee> templist = new ArrayList<>();
		for(Employee e: emplist)
		{
			templist.add(e);
		}
		
		Comparator<Employee> c = (obj1, obj2)->{
			return obj1.getName().compareTo(obj2.getName());
		};
		
		templist.sort(c);
		return templist;
	}

	

	

}
