package com.test;

import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@Transactional
public class StudentController {

	@Autowired
	StudentDao dao;
	
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return dao.getStudents();
	}
	
	@GetMapping("/byId")
	public Student getStudentById(@RequestParam Long id) {
		return dao.getStudentById(id);
	}
	
	
}
