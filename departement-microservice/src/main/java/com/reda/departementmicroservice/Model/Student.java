package com.reda.departementmicroservice.Model;

//@Entity
public class Student {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
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

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartementCode() {
		return departementCode;
	}

	public void setDepartementCode(int departementCode) {
		this.departementCode = departementCode;
	}

	
	
	



}

