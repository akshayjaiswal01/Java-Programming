package com.demo.beans;

public class SalariedEmployee extends Employee
{
	private double basicSalary;

	@Override
	public double calculateSalary() 
	{
		double da = 0.10 * basicSalary;
		double hra = 0.15 * basicSalary;
		double pf = 0.12 * basicSalary;
		return basicSalary + da + hra - pf;
	}

	public SalariedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(int id, String name, String mobile, String email, String department, String designation,
			String dateOfJoining, double basicSalary) 
	{
		super(id, name, mobile, email, department, designation, dateOfJoining);
		
		this.basicSalary = basicSalary;
		
	}

	@Override
	public String toString() {
		return "SalariedEmployee [basicSalary=" + basicSalary + ",\n id=" + id + ",\n name=" + name + ",\n mobile=" + mobile
				+ ",\n email=" + email + ",\n department=" + department + ",\n designation=" + designation
				+ ",\n dateOfJoining=" + dateOfJoining + "]";
	}
	
	
	
	
	

}
