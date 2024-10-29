package com.cttc;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	@GetMapping("/hello")
	public String hello() {
		return "Welcome to CTTC123.";
	}

	@GetMapping("/student")
	public Student getStudent() {
		Student s = new Student(1, "Biswaranjan", "Mohapatra");
		return s;
	}
	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> studentList = new LinkedList<Student>();
		studentList.add(new Student(1, "Abcd", "xyz"));
		studentList.add(new Student(2, "gggg", "xyz"));
		studentList.add(new Student(3, "ggffgfg", "xyz"));
		studentList.add(new Student(4, "gfgfg", "xyz"));
		studentList.add(new Student(5, "ssdsds", "xyz"));
		return studentList;
	}
	
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		System.out.println(student.getFirstName());
		return student;
	}
	
	
	
	
	
	
	
	
	
	
}
