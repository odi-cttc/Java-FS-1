package com.test.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductKey implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long pId;
	private Long cId;
}
