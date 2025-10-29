package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService
{
	private EmployeeDao empDao;

	public EmployeeServiceImpl() 
	{
		empDao = new EmployeeDaoImpl();
	}

	@Override
	public boolean addNewEmployee() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.println("ENter Salary: ");
		double salary = sc.nextDouble();
		
		System.out.println("Enter Joining Date: (dd/mm/yyyy)");
		String date = sc.next();
		
		LocalDate ldt = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Employee emp = new Employee(id, name, salary, ldt);
		
		return empDao.save(emp);
	}

	@Override
	public List<Employee> displayAll() 
	{
		return empDao.findAll();
	}

	@Override
	public Employee searchById(int id) 
	{
		return empDao.findbyId(id);
	}

	@Override
	public boolean deleteById(int id) 
	{
		return empDao.removeById(id);
	}

	@Override
	public List<Employee> findByName(String name) 
	{
		return empDao.findByName(name);
	}

	@Override
	public boolean updateSalary(int id, double salary) 
	{
		return empDao.changeSalary(id, salary);
	}

	@Override
	public boolean deleteBySalary(double salary) 
	{
		
		return empDao.deleteBySalary(salary);
	}

	@Override
	public List<Employee> sortBySalary() 
	{
		
		return empDao.sortBySalary();
	}

	@Override
	public List<Employee> sortByName() 
	{
		
		return empDao.sortByName();
	}

	

	

}
