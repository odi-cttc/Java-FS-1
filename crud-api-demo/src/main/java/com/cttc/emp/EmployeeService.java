package com.cttc.emp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cttc.entity.Employee;

@Service
public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmp();

}
