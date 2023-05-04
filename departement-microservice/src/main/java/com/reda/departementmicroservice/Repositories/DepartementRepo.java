package com.reda.departementmicroservice.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reda.departementmicroservice.Entity.Departement;



public interface DepartementRepo extends JpaRepository<Departement,Integer> {
	
	public Departement findBydepartementCode(int id);

}


