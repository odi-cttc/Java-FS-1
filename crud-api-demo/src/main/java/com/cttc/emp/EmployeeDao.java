package com.cttc.emp;

import org.springframework.data.repository.CrudRepository;

import com.cttc.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Long> {

}
