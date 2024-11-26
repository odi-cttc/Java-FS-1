package com.cttc.emp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;

	@Override
	public Employee saveEmployee(Employee emp) {
		emp.setCreUser("SYSTEM");
		emp.setModifyBy("SYSTEM");
		dao.save(emp);
		return emp;
	}

	@Override
	public List<Employee> getAll() {
		return (List<Employee>) dao.findAll();
	}

	@Override
	public Employee getById(Long id) {
		Optional<Employee> emp = dao.findById(id);
		if (emp.isPresent())
			return emp.get();
		else
			return null;
	}

	@Override
	public Employee editEmployee(Employee emp, Long id) {
		Optional<Employee> existingEmp = dao.findById(id);
		Employee updateEmp = null;
		if (existingEmp.isPresent()) {
			// TO DO Update
			updateEmp = existingEmp.get();
			updateEmp.setFirstName(emp.getFirstName());
			updateEmp.setLastName(emp.getLastName());
			dao.save(updateEmp);
			System.out.println("update Success!");
		} else {
			System.out.println("Id Not Exist!");
		}
		return updateEmp;
	}

	@Override
	public String deleteEmployee(Long id) {
		Optional<Employee> existingEmp = dao.findById(id);
		if (existingEmp.isPresent()) {
			dao.deleteById(id);
			return "Delete Success!";
		} else {
			return "Id not found to delete!";
		}
	}

	@Override
	public Employee findByMail(String mail) {
		return dao.findByMail(mail);
	}

}
