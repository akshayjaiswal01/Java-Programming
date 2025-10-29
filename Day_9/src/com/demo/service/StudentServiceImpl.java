package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.dao.StudentDaoI;
import com.demo.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentServiceI
{
	private StudentDaoI stdDao;
	
	

	public StudentServiceImpl() 
	{
		stdDao = new StudentDaoImpl();
	}



	@Override
	public boolean addNewStudent() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Marks 1: ");
		float m1 = sc.nextFloat();
		
		System.out.println("Enter Marks 2: ");
		float m2 = sc.nextFloat();
		
		System.out.println("Enter Marks 3: ");
		float m3 = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("Enter Date of Birth: (dd/mm/yyyy)");
		String bdate = sc.nextLine();
		
		LocalDate ldt = LocalDate.parse(bdate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Student std = new Student(id, name, m1, m2, m3, ldt);
		
		return stdDao.save(std);
	}



	@Override
	public List<Student> displayAll() 
	{
		return stdDao.displayAll();
	}



	@Override
	public Student searchById(int id) 
	{
		
		return stdDao.searchById(id);
	}



	@Override
	public List<Student> searchByName(String name) 
	{

		return stdDao.searchByName(name);
	}



	@Override
	public boolean updateMarks1(int id, float m1) 
	{
		
		return stdDao.updateMarks1(id, m1);
	}



	@Override
	public boolean updateMarks2(int id, float m2) {
		// TODO Auto-generated method stub
		return stdDao.updateMarks2(id, m2);
	}



	@Override
	public boolean deleteById(int id)
	{
		
		return false;
	}

}
