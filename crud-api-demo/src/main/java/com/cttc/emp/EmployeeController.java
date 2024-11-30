package com.cttc.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cttc.entity.Employee;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	
	@GetMapping("/findAll")
	public List<Employee> getAllEmp(){
		return employeeService.getAllEmp();
	}
	
	@GetMapping("findById/{id}")
	public Employee findById(@PathVariable Long id) {
		return employeeService.findById(id);
	}
}
