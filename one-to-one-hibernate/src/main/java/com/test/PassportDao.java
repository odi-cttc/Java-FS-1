package com.test;

import org.springframework.data.repository.CrudRepository;

import com.test.entity.Passport;

public interface PassportDao extends CrudRepository<Passport, Long>{

}
