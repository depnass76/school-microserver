package com.reda.studentmicroservice.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reda.studentmicroservice.entity.Student;
import com.reda.studentmicroservice.repository.StudentRepo;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentRepo repo;

	@GetMapping("/test")
	public ResponseEntity<String> test() {
		return new ResponseEntity<>("Hello", HttpStatus.OK);
	}

	@GetMapping("/id/{id}")
	public List<Student> getById(@PathVariable("id") Integer id) {
		return repo.findBydepartementCode(id);
	}

	@GetMapping("/getStudent")
	public List<Student> getPatient() {

		return repo.findAll();
	}

	@GetMapping("/calc")
	public List<Integer> getNumber() {
		/*
		 * List<Integer> arr = new ArrayList<Integer>();
		 * 
		 * arr.add(12); arr.add(34); arr.add(87); arr.add(93); arr.add(87); arr.add(93);
		 * 
		 */

		// List<Integer>list= arr.stream().map(a-> a*2).sorted((i1,i2)->
		// i2.compareTo(i1)).collect(Collectors.toList());

		// list.forEach(s->System.out.print(s));

		// return list;

		/*
		 * Optional<Integer> list =arr.stream().max((i1,i2)->i1.compareTo(i2));
		 * 
		 * list.stream().forEach(s->System.out.print(s));
		 * 
		 * return list;
		 */

		/*
		 * //get stream object
		 * 
		 * Stream<Integer> arrObj = arr.stream();
		 * 
		 * //configure stream object
		 * 
		 * Stream<Integer> configObj = arrObj.filter(f-> f > 34 );
		 * 
		 * //process stream object
		 * 
		 * Object[] obj = configObj.toArray();
		 * 
		 * 
		 * 
		 * return obj;
		 * 
		 */

		Stream<Integer> st = Stream.of(33, 55, 44, 6, 7, 3, 2, 88, 923, 21);

		Stream<Integer> ft = st.filter(s -> s % 2 == 0);

		List<Integer> pt = ft.toList();

		return pt;

	}

	@GetMapping("/getAll")
	public Map<Integer, Set<Student>> getAll() {
		Map<Integer, Set<Student>> stMap = repo.findAll().stream()
				.collect(Collectors.groupingBy(s -> s.getDepartementCode(), TreeMap::new, Collectors.toSet()));

		return stMap;

	}

	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		repo.save(student);
		return student;
	}

	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		repo.save(student);

		return student;
	}

	@DeleteMapping("/id/{id}")
	public String deleteStudent(@PathVariable("id") Integer id) {
		Student student = repo.getOne(id);

		repo.delete(student);

		return "Deleted";
	}

}
