package com.demo.beans;

import java.time.LocalDate;

public class Employee 
{
	private int id;
	private String name;
	private double salary;
	private LocalDate jdt;
	
	
	public Employee() {
		super();
	}

	public Employee(int id) {
		super();
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals method "+this.id+"----"+((Employee)obj).id);
		return this.id==((Employee)obj).id;
	}

	public Employee(int id, String name, double salary, LocalDate jdt) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.jdt = jdt;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getJdt() {
		return jdt;
	}

	public void setJdt(LocalDate jdt) {
		this.jdt = jdt;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", jdt=" + jdt + "]";
	}
	
	
	
	
	
}
