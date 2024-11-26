package com.cttc.emp;


import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Long>{
	Employee findByMail(String mail);
	Employee findByAgeGretterThan(int age);
}