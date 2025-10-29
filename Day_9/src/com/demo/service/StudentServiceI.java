package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentServiceI 
{

	boolean addNewStudent();

	List<Student> displayAll();

	Student searchById(int id);

	List<Student> searchByName(String name);

	boolean updateMarks1(int id, float m1);

	boolean updateMarks2(int id, float m2);

	boolean deleteById(int id);

}
