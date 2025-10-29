package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.dao.StudentDaoI;
import com.demo.dao.StudentDaoImpl;
import com.demo.beans.Student;

public class StudentServiceImpl implements StudentServiceI
{
	private StudentDaoI stdDao; 
	
	
	
	public StudentServiceImpl() {
		super();
		this.stdDao = new StudentDaoImpl();
	}

	@Override
	public boolean addNewStudent() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("ENter Name: ");
		String name = sc.nextLine();
		
		System.out.println("ENter Marks 1");
		float m1 = sc.nextFloat();
		
		System.out.println("ENter Marks 2");
		float m2 = sc.nextFloat();
		
		System.out.println("ENter Marks 3");
		float m3 = sc.nextFloat();
		
		System.out.println("ENter Date of Birth");
		String dt = sc.next();
		
		LocalDate ldt = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Student std = new Student(id, name, m1, m2, m3, ldt);
		
		return stdDao.save(std);
	}

	@Override
	public Set<Student> displayAll() 
	{
		return stdDao.displayAll();
	}

	@Override
	public Student findById(int id) 
	{
		
		return stdDao.findById(id);
	}

	@Override
	public Set<Student> findByName(String name) 
	{
		
		return stdDao.findByName(name);
	}

	@Override
	public boolean updateMarks1(int id, float m1) 
	{
		
		return stdDao.updateMarks1(id, m1);
	}

	@Override
	public boolean updateMarks2(int id, float m2) 
	{
		return stdDao.updateMarks2(id, m2);
	}

	@Override
	public boolean rempveById(int id) 
	{
		
		return stdDao.removeById(id);
	}

	@Override
	public boolean rempveByName(String name) 
	{
		
		return stdDao.removeByName(name);
	}

	@Override
	public Set<Student> sortById() 
	{
		
		return stdDao.sortById();
	}

	@Override
	public List<Student> sortByName() 
	{
		
		return stdDao.sortByName();
	}

}
