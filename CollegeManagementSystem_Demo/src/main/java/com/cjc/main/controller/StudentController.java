package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student;
import com.cjc.main.serviceI.StudentServiceI;

@RestController
public class StudentController {
	@Autowired
	private StudentServiceI stuservice;

	@PostMapping("/saveStudentData")
	public ResponseEntity<Student> saveStudentData(@RequestBody Student student) {
		Student stu = stuservice.saveStudentData(student);
		return new ResponseEntity<Student>(stu, HttpStatus.CREATED);

	}
}
