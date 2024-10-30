package com.cttc.emp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private Integer id;
	private String name;
	private String mail;
	private String mobile;
}
