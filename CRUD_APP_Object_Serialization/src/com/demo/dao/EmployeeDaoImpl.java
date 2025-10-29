package com.demo.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDaoI 
{
	static List<Employee> elist = new ArrayList<>();
	
	
	@Override
	public void readFile(String fname) 
	{
		File f = new File(fname);
		
		if(f.exists())
		{
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fname))) 
			{
				while(true)
				{
					Employee emp = (Employee) ois.readObject();
					elist.add(emp);
					
				}
				
				
			} 
			catch(EOFException e) {
				System.out.println("Reached to end of file");
			}
			catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} 
			catch (IOException e) {
				System.out.println(e.getMessage());
			} 
			catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
			} 
		}
		System.out.println("size: "+elist.size());
		
	}


	@Override
	public boolean save(Employee emp) 
	{
		return elist.add(emp);
	}


	@Override
	public boolean deleteByid(int eid) 
	{
		Employee emp = new Employee(eid);
		
		return elist.remove(emp);
	}


	@Override
	public boolean modifySalarybyId(int eid, double salary) 
	{
		Employee emp = new Employee(eid);
		
		int pos = elist.indexOf(emp);
		
		if(pos != -1)
		{
			elist.get(pos).setSalary(salary);
			return true;
		}
		return false;
	}


	@Override
	public List<Employee> displayAll() 
	{
		return elist;
	}


	@Override
	public Employee displayById(int eid) {
		Employee emp = new Employee(eid);
		int pos = elist.indexOf(emp);
		
		if(pos != -1)
		{
			return elist.get(pos);
		}
		return null;
	}


	@Override
	public void saveFile(String fname) 
	{
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname))) 
		{
			for(Employee emp : elist)
			{
				oos.writeObject(emp);
			}
		} catch (FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
		} catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
