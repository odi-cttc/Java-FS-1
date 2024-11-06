package com.cttc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@SpringBootApplication
@Transactional
public class DemoHibernateApplication implements CommandLineRunner{

	@Autowired
	EntityManager em;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoHibernateApplication.class, args);
		System.out.println("Hello Hibernate!");
	}

	@Override
	public void run(String... args) throws Exception {
		Product p1 = new Product(3, "Mobile", 40000);	
		//em.persist(p1);
		//System.out.println("Data Insert Success!");
	}

}
