package com.cjc.main.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Student;
@Repository
public interface StudentRepositary extends JpaRepository<Student, Integer>{

}
