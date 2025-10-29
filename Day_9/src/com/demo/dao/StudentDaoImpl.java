package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDaoI
{
	List<Student> stdlist = new ArrayList<>();

	@Override
	public boolean save(Student std) 
	{
		stdlist.add(std);
		return true;
	}

	@Override
	public List<Student> displayAll() 
	{
		return stdlist;
	}

	@Override
	public Student searchById(int id) 
	{
		int pos = stdlist.indexOf(new Student(id));
		if(pos != -1)
		{
			return stdlist.get(pos);
		}
		return null;
	}

	@Override
	public List<Student> searchByName(String name) 
	{
		List<Student> templist = new ArrayList<>();
		
		for(Student std: stdlist)
		{
			if(std.getName().equals(name))
			{
				templist.add(std);
			}
		}
		
		if(templist.size()>0)
		{
			return templist;
		}
		
		return null;
		
	}

	@Override
	public boolean updateMarks1(int id, float m1) 
	{
		int pos = stdlist.indexOf(new Student(id));
		if(pos != -1)
		{
			stdlist.get(pos).setM1(m1);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateMarks2(int id, float m2) {
		int pos = stdlist.indexOf(new Student(id));
		if(pos != -1)
		{
			stdlist.get(pos).setM2(m2);
			return true;
		}
		return false;
	}

}
