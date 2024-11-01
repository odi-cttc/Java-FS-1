package com.cttc.emp;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/save")
	public String save(@RequestBody Employee emp) {
		return employeeService.save(emp);
	}
	
	@GetMapping("/findAll")
	public Set<Employee> getEmployees(){
		return employeeService.getEmployees();
	}
	
	@DeleteMapping("/delete")
	//http://localhost:2025/delete?id=1
	public String deleteById(@RequestParam Integer id) {
		return employeeService.deleteById(id);
	}
	

	@PutMapping("/update/{id}")
	//http://localhost:2025/update/1
	public String updateById(@PathVariable Integer id, @RequestBody Employee emp) {
		return employeeService.updateEmpById(id,emp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
