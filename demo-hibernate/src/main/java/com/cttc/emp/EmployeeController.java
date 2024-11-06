package com.cttc.emp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Transactional
@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EntityManager entityManager;
	
	@PostMapping("/save")
	public Employee saveEmp(@RequestBody Employee emp) {
		emp.setCreUser("biswa");
		//emp.setCreDate(LocalDateTime.now());
		emp.setModifyBy("biswa");
		//emp.setModifyDate(LocalDateTime.now());
	
		entityManager.persist(emp);
		return emp;
	}
}
