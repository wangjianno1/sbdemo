package com.bat.sbdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bat.sbdemo.entity.Student;
import com.bat.sbdemo.repository.StudentRepository;
import com.bat.sbdemo.service.StudentService;

@Service
public class StudentSeriveImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        List<Student> allStudent = studentRepository.findAll();
        return allStudent;
    }

    @Override
    public Student addStudent(Student student) {
        Student someStud = studentRepository.save(student);
        return someStud;
    }

}
