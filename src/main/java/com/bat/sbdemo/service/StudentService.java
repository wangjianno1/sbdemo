package com.bat.sbdemo.service;

import java.util.List;

import com.bat.sbdemo.entity.Student;

public interface StudentService {

	public List<Student> getAllStudent();
	
	public Student addStudent(Student student);
}
