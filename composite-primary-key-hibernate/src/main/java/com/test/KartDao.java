package com.test;

import org.springframework.data.repository.CrudRepository;

import com.test.entity.Kart;
import com.test.entity.ProductKey;

public interface KartDao extends CrudRepository<Kart, ProductKey>{

}
