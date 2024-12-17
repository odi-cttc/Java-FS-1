package com.test;

import org.springframework.data.repository.CrudRepository;

import com.test.entity.Product;

public interface ProductDao extends CrudRepository<Product, Long>{

}
