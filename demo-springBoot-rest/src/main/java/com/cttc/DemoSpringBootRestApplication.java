package com.cttc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringBootRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootRestApplication.class, args);
		System.out.println("Spring Boot RestAPI");
	}

}
