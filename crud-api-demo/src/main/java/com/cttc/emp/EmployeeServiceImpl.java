package com.cttc.emp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cttc.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;

	@Override
	public Employee saveEmployee(Employee employee) {
		return dao.save(employee);
	}

	@Override
	public List<Employee> getAllEmp() {
		return (List<Employee>) dao.findAll();
	}

	@Override
	public Employee findById(Long id) {
		Optional<Employee> empById = dao.findById(id);
		if (empById.isPresent())
			return empById.get();
		return null;
	}
}
