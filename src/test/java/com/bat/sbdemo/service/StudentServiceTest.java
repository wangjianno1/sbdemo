package com.bat.sbdemo.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bat.sbdemo.entity.Student;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {
	
	@Autowired
	private StudentService studentService;
	
	@Test
	public void getAllStudentTest() {
		List<Student> allStudent = studentService.getAllStudent();
		Assert.assertNotNull(allStudent);
	}
	
	@Test
	public void addStudentTest() {
		Student student = new Student();
		student.setName("xueMM");
		student.setAge(20);
		student.setSex("male");
		student.setScore(90);
		Student stu = studentService.addStudent(student);
		Assert.assertTrue(stu.getName().equalsIgnoreCase("xueMM"));
		
	}

}
