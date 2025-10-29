package com.demo.beans;

public class ContractEmployee extends Employee
{
	private int hoursWorked;
	private double hourlyRate;

	@Override
	public double calculateSalary() 
	{
		
		return hoursWorked * hourlyRate;
	}

	public ContractEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(int id, String name, String mobile, String email, String department, String designation,
			String dateOfJoining, int hoursWorked, double hourlyRate) 
	{
		super(id, name, mobile, email, department, designation, dateOfJoining);
		
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
		
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "ContractEmployee [hoursWorked=" + hoursWorked + ",\n hourlyRate=" + hourlyRate + ",\n id=" + id + ",\n name="
				+ name + ",\n mobile=" + mobile + ",\n email=" + email + ",\n department=" + department + ",\n designation="
				+ designation + ",\n dateOfJoining=" + dateOfJoining + "]";
	}
	
	
	
	
	
	

}
