package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.entity.Passport;
import com.test.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@SpringBootApplication
@Transactional
public class OneToOneHibernateApplication implements CommandLineRunner{

	@Autowired
	EntityManager em;
	public static void main(String[] args) {
		SpringApplication.run(OneToOneHibernateApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Passport p1 = new Passport();
		p1.setP_no("P001");
		p1.setAuth("BBSR");
		
		Person per1 = new Person();
		per1.setName("Biswa");
		per1.setMail("b@gmail.com");
		per1.setMobile("909090909");
		per1.setPassport(p1);
		//p1.setPerson(per1);
		
		//em.persist(per1);
		
	}

}
