package com.demo.beans;

import com.demo.exception.NegativeSalaryException;

public class Employee 
{
	private int eid;
	private String ename;
	private double esalary;
	
	public Employee() {
		super();
	}

	public Employee(int eid, String ename, double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) throws NegativeSalaryException {
		
		if(esalary < 0)
		{
			throw new NegativeSalaryException("Salary cannto be negative");
		}
		
		if(esalary < 2000)
		{
			throw new NegativeSalaryException("Salary cannot be lesst than 2000");
		}
		
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}

	
	
	
	
	
}
