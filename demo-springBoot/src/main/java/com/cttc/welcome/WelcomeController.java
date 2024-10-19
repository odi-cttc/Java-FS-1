package com.cttc.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class WelcomeController {
	
	@Autowired
	WelcomeService welcomeService;
	
	public String welcome() {
		return welcomeService.welcome();
	}

}
