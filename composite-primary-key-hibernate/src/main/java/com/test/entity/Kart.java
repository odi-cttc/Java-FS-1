package com.test.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Kart {

	@EmbeddedId
	private ProductKey key;
	
	private float totalPrice;
	private int number;
	
}
