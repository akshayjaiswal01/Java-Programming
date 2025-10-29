package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDaoI;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeServiceI 
{

	EmployeeDaoI edao = new EmployeeDaoImpl();
	
	@Override
	public void readFile(String fname) 
	{
		edao.readFile(fname);
		
	}

	@Override
	public boolean addNewEmployee() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID: ");
		int eid = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Employee Name: ");
		String ename = sc.nextLine();
		
		System.out.println("Enter Employee Designation: ");
		String desg = sc.nextLine();
		
		System.out.println("Enter Employee Salary: ");
		double salary = sc.nextDouble();
		
		Employee emp = new Employee(eid, ename, desg, salary);
		
		return edao.save(emp);
		
	}

	@Override
	public boolean deleteById(int eid) 
	{
		
		return edao.deleteByid(eid);
	}

	@Override
	public boolean modifySalarybyId(int eid, double salary) 
	{
		return edao.modifySalarybyId(eid, salary);
	}

	@Override
	public List<Employee> displayAll() {
		
		return edao.displayAll();
	}

	@Override
	public Employee displayById(int eid) {
		// TODO Auto-generated method stub
		return edao.displayById(eid);
	}

	@Override
	public void saveFile(String fname) 
	{
		edao.saveFile(fname);
		
	}

}
