package com.reda.departementmicroservice.Model;

import java.util.List;

import com.reda.departementmicroservice.Entity.Departement;


public class StudentDepartement {
	
    private Departement departement;	
	private List<Student> student;
	
	
	
	public Departement getDepartment() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
 
	
	

}
