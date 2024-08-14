package com.cjc.main.serviceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.ExamForm;
import com.cjc.main.model.Student;
import com.cjc.main.repositary.ExamFormRepositary;
import com.cjc.main.repositary.StudentRepositary;
import com.cjc.main.serviceI.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI {
	@Autowired
	private StudentRepositary repositary;
	
	@Autowired private ExamFormRepositary efrepositary;

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

	@Override
	public void deleteStudent(int studentRollnumber) {
		
		repositary.deleteById(studentRollnumber);
		
	}

	@Override
	public ExamForm saveExamDetails(ExamForm examForm) {
		
		ExamForm examFormRef=efrepositary.save(examForm);
		
		return examFormRef;
	}

	@Override
	public List<ExamForm> getAllExamDetails() {
		List<ExamForm> examFormList=efrepositary.findAll();
		return examFormList;
	}
	@Override
	public ExamForm updateData(int examId, ExamForm examform) {
		
		ExamForm examRef=efrepositary.save(examform);
		
		return  examRef;
	}

	

	@Override
	public ExamForm getSingleDetail(int examId) {
		
		return efrepositary.findById(examId).get();

	}

}
