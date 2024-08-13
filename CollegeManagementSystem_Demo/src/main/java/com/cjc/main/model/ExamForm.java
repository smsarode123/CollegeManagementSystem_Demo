package com.cjc.main.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ExamForm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int examId;
	private String examName;
	private String examDate;
	private boolean examResult;

}
