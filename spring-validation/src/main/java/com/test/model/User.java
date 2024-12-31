package com.test.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {
	private Long id;
	
	@NotBlank(message = "Name Should not blank.")
	@NotNull(message = "Name cannot be null")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
	private String name;
	
	@NotBlank(message = "Name Should not blank.")
	@NotNull(message = "Name cannot be null")
	@Size(min = 10, max = 10, message = "Mobile should be 10 Digit.")
	private String mobile;
}
