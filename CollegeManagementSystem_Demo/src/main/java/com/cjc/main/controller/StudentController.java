package com.cjc.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.ExamForm;
import com.cjc.main.model.Student;
import com.cjc.main.serviceI.StudentServiceI;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StudentController {
	@Autowired
	private StudentServiceI stuservice;

	@PostMapping("/saveStudentData")
	public ResponseEntity<Student> saveStudentData(@RequestBody Student student) {
		Student stu = stuservice.saveStudentData(student);
		return new ResponseEntity<Student>(stu, HttpStatus.CREATED);

	}
	
	@GetMapping("/getAllStudent")
	public ResponseEntity<List<Student>> getAllStudent() {
		
		List<Student> list=stuservice.getAllStudent();
		
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/getSingleStudent/{studentRollnumber}")
	public ResponseEntity<Student> getSingleStudent(@PathVariable int studentRollnumber){
		
		Student student = stuservice.getSingleStudent(studentRollnumber);
		
		
		return new ResponseEntity<Student>(student,HttpStatus.OK);
		
		
	}
	
	@PutMapping("/updateStudentData/{studentRollnumber}")
	public ResponseEntity<Student> updateStudentData(@PathVariable int studentRollnumber,@RequestBody Student stu){
		
		Student student = stuservice.updateData(studentRollnumber,stu);
		
		return new  ResponseEntity<Student>(student,HttpStatus.OK);
		
	}
	@DeleteMapping("/deletestudentRollnumber/{studentRollnumber}")
	  public ResponseEntity<String> deleteStudent(@PathVariable("studentRollnumber") int studentRollnumber)
	  {
	       stuservice.deleteStudent(studentRollnumber);
	       ResponseEntity<String> response=new ResponseEntity<String>("Delete Data of Student",HttpStatus.GONE);
	       
	       return response;
	  
	  }
	
	@PostMapping("/post-Exam-Details")
	public ResponseEntity<ExamForm> saveDetails(@RequestBody ExamForm examForm)
	{
		ExamForm examFormRef=stuservice.saveExamDetails(examForm);
		return new ResponseEntity<ExamForm>(examFormRef, HttpStatus.CREATED);
	}
	
	@GetMapping("/fetch-All-Datails")
	public ResponseEntity<List<ExamForm>> getAllExamDetails()
	{
		List<ExamForm> examFormList=stuservice.getAllExamDetails();
		return new ResponseEntity<List<ExamForm>>(examFormList, HttpStatus.FOUND);
	}
	@GetMapping("/getSinglDeatailBYExamId/{examId}")
	public ResponseEntity<ExamForm> getSingleExamDetail(@PathVariable int examId){
		ExamForm exam=stuservice.getSingleDetail(examId);
		return new ResponseEntity<ExamForm>(exam,HttpStatus.OK);
	}
}
