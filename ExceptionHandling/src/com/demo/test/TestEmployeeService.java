package com.demo.test;

import com.demo.exception.NegativeSalaryException;
import com.demo.service.EmployeeService;

public class TestEmployeeService {

	public static void main(String[] args) 
	{
		EmployeeService es = new EmployeeService();
		
		try {
			es.acceptData();
		} 
		catch (NegativeSalaryException e) {
			System.err.println(e.getMessage());
		}

	}

}
