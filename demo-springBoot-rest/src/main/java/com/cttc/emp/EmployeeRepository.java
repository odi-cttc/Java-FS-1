package com.cttc.emp;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

	Set<Employee> empSet = new HashSet<>();
	
	public String save(Employee emp) {
		empSet.add(emp);
		return "Save Success";
	}

	public Set<Employee> getEmployees() {
		return empSet;
	}

	public String deleteById(Integer id) {
		empSet.removeIf(emp -> emp.getId() == id);
		return "Delete Success!";
	}

}
