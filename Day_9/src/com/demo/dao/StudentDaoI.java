package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDaoI 
{

	boolean save(Student std);

	List<Student> displayAll();

	Student searchById(int id);

	List<Student> searchByName(String name);

	boolean updateMarks1(int id, float m1);

	boolean updateMarks2(int id, float m2);

}
