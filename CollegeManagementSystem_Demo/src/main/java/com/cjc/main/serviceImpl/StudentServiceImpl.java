package com.cjc.main.serviceImpl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Student getSingleStudent(int studentRollnumber) {
		
		return repositary.findById(studentRollnumber).get();
	}

	@Override
	public Student updateData(int studentRollnumber, Student stu) {
		
		Optional<Student> student = repositary.findById(studentRollnumber);
		
		if(student.isPresent()) {
			
			Student upStudent = student.get();
			
			upStudent.setStudentRollnumber(studentRollnumber);
			
			return repositary.save(stu);
			
		}
		return null;
	}

}
