package com.cttc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Transactional
@RestController
public class CustomerController {

	@Autowired
	EntityManager em;

	@PostMapping("/save")
	public Customer saveCustomer(@RequestBody Customer customer) {
		em.persist(customer);
		return customer;
	}

	@GetMapping("/getAll")
	public List<Customer> getCustomers() {
		@SuppressWarnings("unchecked")
		List<Customer> resultList = em.createNativeQuery("select * from customer", Customer.class).getResultList();
		return resultList;
	}

	@PutMapping("/editCustomer/{id}")
	public Customer editCustomer(@RequestBody Customer customer, @PathVariable Long id) {
		System.out.println(id + " " + customer.getMobile() + " " + customer.getMail());
		Customer existingCustomer = em.find(Customer.class, id);
		if (existingCustomer == null)
			System.out.println("No Customer found with ID : " + id);
		else {
			existingCustomer.setMail(customer.getMail());
			existingCustomer.setMobile(customer.getMobile());
			em.merge(existingCustomer);
			em.flush();
		}
		return existingCustomer;
	}

	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		String msg = null;
		Customer existingCustomer = em.find(Customer.class, id);
		if (existingCustomer == null) {
			msg = "Customer Not Found with Id -" + id;
		} else {
			int count = em.createNativeQuery("delete from customer where id = " + id).executeUpdate();
			msg = count > 0 ? "Delete Success with id "+id : "Delete Unsuccessfull!;";
	
		}
		return msg;
	}
}
