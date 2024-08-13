package com.cjc.main.serviceI;

import java.util.List;

import com.cjc.main.model.Student;

public interface StudentServiceI {

	Student saveStudentData(Student student);

	List<Student> getAllStudent();

	Student getSingleStudent(int studentRollnumber);

	Student updateData(int studentRollnumber, Student stu);

}
