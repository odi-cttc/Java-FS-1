package com.cttc.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService{
	
	@Autowired
	WelcomeRepository welcomeRepository;

	@Override
	public String welcome() {
		String name = welcomeRepository.welcome();
		return "Welcome - "+name;
	}
	
	
	

}
