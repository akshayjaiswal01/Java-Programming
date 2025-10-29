package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeServiceI {

	void readFile(String fname);

	boolean addNewEmployee();

	boolean deleteById(int eid);

	boolean modifySalarybyId(int eid, double salary);

	List<Employee> displayAll();

	Employee displayById(int eid);

	void saveFile(String fname);

}
