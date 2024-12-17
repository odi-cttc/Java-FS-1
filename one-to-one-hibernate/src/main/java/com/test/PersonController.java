package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PersonController {
	
	@Autowired
	PersonDao personDao;
	
	@PostMapping("/save")
	public Person savePerson(@RequestBody Person person) {
		return personDao.save(person);
	}
	
	@GetMapping("/all")
	public Iterable<Person> getPerson() {
		return personDao.findAll();
	}
	
}
