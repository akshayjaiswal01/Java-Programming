package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDaoI {

	void readFile(String fname);

	boolean save(Employee emp);

	boolean deleteByid(int eid);

	boolean modifySalarybyId(int eid, double salary);

	List<Employee> displayAll();

	Employee displayById(int eid);

	void saveFile(String fname);

}
