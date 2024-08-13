package com.cjc.main.serviceI;

import java.util.List;

import com.cjc.main.model.ExamForm;
import com.cjc.main.model.Student;

public interface StudentServiceI {

	Student saveStudentData(Student student);

	List<Student> getAllStudent();

	Student getSingleStudent(int studentRollnumber);

	Student updateData(int studentRollnumber, Student stu);

	void deleteStudent(int studentRollnumber);

	ExamForm saveExamDetails(ExamForm examForm);

	List<ExamForm> getAllExamDetails();

}
