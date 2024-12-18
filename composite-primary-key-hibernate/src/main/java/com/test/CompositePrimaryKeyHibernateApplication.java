package com.test;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.entity.Kart;
import com.test.entity.ProductKey;

import jakarta.transaction.Transactional;

@SpringBootApplication
@Transactional
public class CompositePrimaryKeyHibernateApplication implements CommandLineRunner {

	@Autowired
	KartDao dao;

	public static void main(String[] args) {
		SpringApplication.run(CompositePrimaryKeyHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
  
		ProductKey key = new ProductKey(2L, 2L);

		Kart kart = new Kart();
		kart.setKey(key);
		kart.setTotalPrice(30000);
		kart.setNumber(10);

		// dao.save(kart);
		System.out.println("Data Save Success..");

		Optional<Kart> kartById = dao.findById(new ProductKey(5L, 1L));
		if (kartById.isEmpty())
			System.out.println("No Data Found!");
		else {
			Kart k = kartById.get();
			System.out.println(
					k.getKey().getCId() + " " + k.getKey().getPId() + " " + k.getTotalPrice() + " " + k.getNumber());
		}

	}

}
