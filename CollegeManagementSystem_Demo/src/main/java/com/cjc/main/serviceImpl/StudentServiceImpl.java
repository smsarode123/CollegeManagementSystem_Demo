package com.cjc.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repositary.StudentRepositary;
import com.cjc.main.serviceI.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI {
	@Autowired
	private StudentRepositary repositary;

	@Override
	public Student saveStudentData(Student student) {
		
		return repositary.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return repositary.findAll();
	}

}