package com.cttc;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
	private Integer id;
	private String firstName;
	private String lastName;
}
