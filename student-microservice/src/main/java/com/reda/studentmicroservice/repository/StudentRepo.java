package com.reda.studentmicroservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reda.studentmicroservice.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {
	
	public List<Student> findBydepartementCode(Integer id);
	
}
