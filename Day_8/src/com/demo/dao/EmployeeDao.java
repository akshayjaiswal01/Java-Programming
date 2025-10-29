package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao 
{
	boolean save(Employee e);
	
	List<Employee> findAll();
	
	Employee findbyId(int id);
	
	boolean removeById(int id);
	
	List<Employee> findByName(String name);
	
	boolean changeSalary(int id, double salary);

	boolean deleteBySalary(double salary);

	List<Employee> sortBySalary();

	List<Employee> sortByName();
}
