package com.demo.beans;

public abstract class Employee 
{
	protected int id;
	protected String name;
	protected String mobile;
	protected String email;
	protected String department;
	protected String designation;
	protected String dateOfJoining;
	
	public abstract double calculateSalary();

	public Employee() {
		super();
	}



	public Employee(int id, String name, String mobile, String email, String department, String designation,
			String dateOfJoining) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.department = department;
		this.designation = designation;
		this.dateOfJoining = dateOfJoining;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ",\n name=" + name + ",\n mobile=" + mobile + ",\n email=" + email + ",\n department="
				+ department + ",\n designation=" + designation + ",\n dateOfJoining=" + dateOfJoining + "]";
	}
	
	

	
	
	
	
	
}
