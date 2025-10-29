package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Student;

public interface StudentDaoI {

	boolean save(Student std);

	Set<Student> displayAll();

	Student findById(int id);

	Set<Student> findByName(String name);

	boolean updateMarks1(int id, float m1);

	boolean updateMarks2(int id, float m2);

	boolean removeById(int id);

	boolean removeByName(String name);

	Set<Student> sortById();

	List<Student> sortByName();

	 

}
