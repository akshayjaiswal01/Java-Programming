package com.demo.beans;

public class Vendor extends Employee
{
	private int noOfEmployee;
	private double amount;
	
	@Override
	public double calculateSalary() {
		
		return amount + (amount * 0.18);
	}

	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendor(int id, String name, String mobile, String email, String department, String designation,
			String dateOfJoining, int noOfEmployee, double amount) 
	{
		super(id, name, mobile, email, department, designation, dateOfJoining);
		this.noOfEmployee = noOfEmployee;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Vendor [noOfEmployee=" + noOfEmployee + ",\n amount=" + amount + ",\n id=" + id + ",\n name=" + name
				+ ",\n mobile=" + mobile + ",\n email=" + email + ",\n department=" + department + ",\n designation="
				+ designation + ",\n dateOfJoining=" + dateOfJoining + "]";
	}
	
	
	
	

}
