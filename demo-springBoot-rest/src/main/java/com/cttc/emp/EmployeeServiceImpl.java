package com.cttc.emp;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public String save(Employee emp) {
		return employeeRepository.save(emp);
	}

	@Override
	public Set<Employee> getEmployees() {
		return employeeRepository.getEmployees();
	}

	@Override
	public String deleteById(Integer id) {
		
		return employeeRepository.deleteById(id);
	}

	@Override
	public String updateEmpById(Integer id, Employee emp) {
		return employeeRepository.updateEmpById(id,emp);
	}

}
