package com.test;

import org.springframework.data.repository.CrudRepository;

import com.test.entity.Person;

public interface PersonDao extends CrudRepository<Person, Long>{

}
