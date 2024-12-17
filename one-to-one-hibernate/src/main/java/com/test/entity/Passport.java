package com.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String p_no;
	private String auth;
}
