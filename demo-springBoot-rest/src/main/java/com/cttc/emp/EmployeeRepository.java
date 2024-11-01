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

	public String updateEmpById(Integer id, Employee emp) {
		String msg = "";
		int flag = 1;
		for (Employee e : empSet) {
			if (e.getId() == id) {
				// e.setId(emp.getId());
				e.setName(emp.getName());
				e.setMail(emp.getMail());
				e.setMobile(emp.getMobile());
				flag = 0;
				break;
			} else {
				flag = 1;
			}
		}
		return flag == 0 ? "Update Success." : "Employee Id Not Found!";
	}

}
