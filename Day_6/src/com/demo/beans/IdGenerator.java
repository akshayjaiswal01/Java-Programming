package com.demo.beans;

public class IdGenerator 
{
	private static int empId = 1000;

	public static int generateEmpId() {
		return empId++;
	}
}
