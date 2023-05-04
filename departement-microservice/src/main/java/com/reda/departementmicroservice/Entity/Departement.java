package com.reda.departementmicroservice.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Departement {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int departementCode;
	private String name;
	public int getDepartementCode() {
		return departementCode;
	}
	public void setDepartementCode(int departementCode) {
		this.departementCode = departementCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
	


}
