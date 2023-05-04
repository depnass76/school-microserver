package com.reda.departementmicroservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.reda.departementmicroservice.Entity.Departement;
import com.reda.departementmicroservice.Model.Student;
import com.reda.departementmicroservice.Model.StudentDepartement;
import com.reda.departementmicroservice.Repositories.DepartementRepo;

@CrossOrigin
@RestController
@RequestMapping("/departement")
public class DepartementController {

	@Autowired
	private DepartementRepo departementRepo;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/add")
	public Departement addUniversity(@RequestBody Departement departement) {
		departementRepo.save(departement);

		return departement;
	}

	@GetMapping("/getDep")
	public List<Departement> getDepartement() {

		return departementRepo.findAll();
	}

	@HystrixCommand(fallbackMethod = "handlePatientDownTime")
	@GetMapping("/id/{id}")
	public ResponseEntity<StudentDepartement> getReponseData(@PathVariable Integer id) {
		
		StudentDepartement studentDepartement = new StudentDepartement();

		// get University details
		Departement dep = departementRepo.findById(id).get();
		studentDepartement.setDepartement(dep);

		// get all student registered in university
		@SuppressWarnings("unchecked")
		List<Student> listOfstudent = restTemplate.getForObject("http://STUDENT-SERVICE/student/id/" + id, List.class);
		studentDepartement.setStudent(listOfstudent);

		return new ResponseEntity<StudentDepartement>(studentDepartement, HttpStatus.OK);

	}

	public ResponseEntity<StudentDepartement> handlePatientDownTime(@PathVariable Integer id) {
		StudentDepartement studentDepartement = new StudentDepartement();
		// get University details
		Departement dep = departementRepo.findBydepartementCode(id);
		studentDepartement.setDepartement(dep);

		return new ResponseEntity<StudentDepartement>(studentDepartement, HttpStatus.OK);

	}
  

}
