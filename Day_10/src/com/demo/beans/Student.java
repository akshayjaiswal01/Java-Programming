package com.demo.beans;

import java.time.LocalDate;
import java.util.Objects;

public class Student implements Comparable<Student>
{
	private int id;
	private String name;
	private float m1;
	private float m2;
	private float m3;
	private LocalDate bdate;
	
	
	public Student() {
		super();
	}
	
	


	public Student(int id) {
		super();
		this.id = id;
	}




	public Student(int id, String name, float m1, float m2, float m3, LocalDate bdate) {
		super();
		this.id = id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.bdate = bdate;
	}
	


	@Override
	public int hashCode() {
		return id;
	}


	@Override
	public boolean equals(Object obj) {
		
		return this.id == ((Student)obj).id;
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


	public float getM1() {
		return m1;
	}


	public void setM1(float m1) {
		this.m1 = m1;
	}


	public float getM2() {
		return m2;
	}


	public void setM2(float m2) {
		this.m2 = m2;
	}


	public float getM3() {
		return m3;
	}


	public void setM3(float m3) {
		this.m3 = m3;
	}


	public LocalDate getBdate() {
		return bdate;
	}


	public void setBdate(LocalDate bdate) {
		this.bdate = bdate;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", bdate=" + bdate
				+ "]";
	}


	@Override
	public int compareTo(Student o) 
	{
		return this.id - o.id;
	}


	
	
}
