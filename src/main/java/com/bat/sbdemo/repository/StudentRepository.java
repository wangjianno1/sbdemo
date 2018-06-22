package com.bat.sbdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bat.sbdemo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	// Repository层只需要定义一个继承自JpaRepository相关接口的接口即可，该接口中不需要声明任何方法，除非你有特殊的数据库操作，在默认的JpaRepository接口中不支持。
}
