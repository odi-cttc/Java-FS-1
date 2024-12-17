package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Customer;

@RestController
public class CustomerController {
	@Autowired
	CustomerDao dao;

	@PostMapping("/save")
	public Customer save(@RequestBody Customer customer) {
		return dao.save(customer);
	}
	
	@GetMapping("/all")
	public Iterable<Customer> findCustomers() {
		return dao.findAll();
	}
}
