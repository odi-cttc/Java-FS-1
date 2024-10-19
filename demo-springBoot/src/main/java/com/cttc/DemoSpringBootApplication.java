package com.cttc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cttc.welcome.WelcomeController;

@SpringBootApplication
public class DemoSpringBootApplication implements CommandLineRunner{
	@Autowired
	StudentService studentService;
	
	@Autowired
	WelcomeController welcomeController;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootApplication.class, args);
		System.out.println("Hello Spring..");
	}

	@Override
	public void run(String... args) throws Exception {
		studentService.showStudents();
		
		String myName = welcomeController.welcome();
		System.out.println(" "+myName);
	}

}
