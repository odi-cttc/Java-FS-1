package com.cttc;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Product {

	@Id
	private Integer id;
	private String productName;
	private float price;
}
