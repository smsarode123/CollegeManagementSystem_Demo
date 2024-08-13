package com.cjc.main.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.main.model.Student;

public interface StudentRepositary extends JpaRepository<Student, Integer>{

}
