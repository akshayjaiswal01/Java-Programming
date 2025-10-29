package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService 
{
	boolean addNewEmployee();
	
	List<Employee> displayAll();
	
	Employee searchById(int id);
	
	boolean deleteById(int id);
	
	List<Employee> findByName(String name);
	
	boolean updateSalary(int id, double salary);

	boolean deleteBySalary(double salary);

	List<Employee> sortBySalary();

	List<Employee> sortByName();
}
