package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Student;

public interface StudentServiceI {

	boolean addNewStudent();

	Set<Student> displayAll();

	Student findById(int id);

	Set<Student> findByName(String name);

	boolean updateMarks1(int id, float m1);

	boolean updateMarks2(int id, float m2);

	boolean rempveById(int id);

	boolean rempveByName(String name);

	Set<Student> sortById();

	List<Student> sortByName();

}
