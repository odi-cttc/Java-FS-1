package com.test;

import org.springframework.data.repository.CrudRepository;

import com.test.entity.Customer;

public interface CustomerDao extends CrudRepository<Customer, Long>{
	
}
