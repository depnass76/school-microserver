package com.reda.studentmicroservice.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;	
	
	private String name;
	
	private int departementCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getDepartementCode() {
		return departementCode;
	}

	public void setDepartementCode(int departementCode) {
		this.departementCode = departementCode;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}

