package com.demo.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDaoI
{
	Set<Student> stdset = new HashSet<>();

	@Override
	public boolean save(Student std) 
	{
		return stdset.add(std);
	}

	@Override
	public Set<Student> displayAll() 
	{
		
		return stdset;
	}

	@Override
	public Student findById(int id) 
	{
		Optional<Student> std = stdset.stream().filter(e-> e.getId() == id).findFirst();
		if(std.isPresent())
		{
			return std.get();
		}
		return null;
	}

	@Override
	public Set<Student> findByName(String name) 
	{
		Set<Student> std = stdset.stream().filter(e-> e.getName().equals(name)).collect(Collectors.toSet());
		
		if(std.size()>0)
		{
			return std;
		}
		return null;
	}

	@Override
	public boolean updateMarks1(int id, float m1) 
	{
		Student std = findById(id);
		
		if(std != null)
		{
			std.setM1(m1);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateMarks2(int id, float m2) 
	{
		Student std = findById(id);
		
		if(std != null)
		{
			std.setM2(m2);
			return true;
		}
		return false;
	}

	@Override
	public boolean removeById(int id) 
	{
		return stdset.remove(new Student(id));
	}

	@Override
	public boolean removeByName(String name) 
	{
		return stdset.removeIf(std -> std.getName().equals(name));
	}

	@Override
	public Set<Student> sortById() 
	{
		Set<Student> tempset = new TreeSet<>();
		
		for(Student std : stdset)
		{
			tempset.add(std);
		}
		
		return tempset;
	}

	@Override
	public List<Student> sortByName() 
	{
		List<Student> templist = new ArrayList<>();
		
		Comparator<Student> c = (obj1, obj2)->{
			return obj1.getName().compareTo(obj2.getName());
		};
		
		for(Student std: stdset)
		{
			templist.add(std);
		}
		
		templist.sort(c);
		return templist;
	}
	

}
