package com.bat.sbdemo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bat.sbdemo.entity.Student;
import com.bat.sbdemo.service.StudentService;
import com.bat.sbdemo.utils.ResultBody;
import com.bat.sbdemo.utils.ResultUtil;

@RestController
@RequestMapping("/student")
public class StudentController {

	private final Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/all")
	public ResultBody<List<Student>> getAllStudent() throws Exception {
		List<Student> allStudent = studentService.getAllStudent();
		//throw new GlobalProcessException("我是全局处理异常哦。。。。");
		logger.info("infoinfoinfo~~~~~~~~~~~~~~~~~");
		logger.debug("debugdebugdebug~~~~~~~~~~~~~~~~~");
		return ResultUtil.success(allStudent);
	}

	@PostMapping("/add")
	public ResultBody<Student> addStudent(@RequestParam("name") String name, @RequestParam("age") Integer age,
			@RequestParam("sex") String sex, @RequestParam("score") Integer score) {
		Student student = new Student();
		student.setName(name);
		student.setAge(age);
		student.setSex(sex);
		student.setScore(score);

		studentService.addStudent(student);
		return ResultUtil.success(student);
	}
}
