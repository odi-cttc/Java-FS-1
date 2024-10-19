package com.cttc.welcome;

import org.springframework.stereotype.Repository;

@Repository
public class WelcomeRepository {
	private String name = "Biswaranjan Mohapatra";

	public String welcome() {
		return name;
	}

}
