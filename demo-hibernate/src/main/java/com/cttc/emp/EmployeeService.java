package com.cttc.emp;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

	Employee saveEmployee(Employee emp);

	List<Employee> getAll();

	Employee getById(Long id);

	Employee editEmployee(Employee emp, Long id);

	String deleteEmployee(Long id);

	Employee findByMail(String mail);

}
