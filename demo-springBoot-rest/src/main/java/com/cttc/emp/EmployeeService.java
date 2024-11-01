package com.cttc.emp;

import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

	String save(Employee emp);

	Set<Employee> getEmployees();

	String deleteById(Integer id);

	String updateEmpById(Integer id, Employee emp);

}
