package com.cjc.main.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentRollnumber;
	private String studentName;
	private String studentAddress;
	private long studentMobileNumber;
	private Date dateOfAdmission;
	private String username;
	private String password;
	@OneToOne(cascade = CascadeType.ALL)
	private ExamForm form;
	

}
