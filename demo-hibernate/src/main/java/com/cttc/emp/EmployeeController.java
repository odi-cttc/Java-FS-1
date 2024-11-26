package com.cttc.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee emp) {
		return employeeService.saveEmployee(emp);
	}
	
	@GetMapping("/all")
	public List<Employee> getAll(){
		return employeeService.getAll();
	}
	
	@GetMapping("/getById/{id}")
	public Employee getById(@PathVariable Long id){
		return employeeService.getById(id);
	}
	
	@PutMapping("/update/{id}")
	public Employee editEmployee(@RequestBody Employee emp, @PathVariable Long id) {
		return employeeService.editEmployee(emp,id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		return employeeService.deleteEmployee(id);
	}
	
	@GetMapping("/findByMail/{mail}")
	public Employee findByMail(@PathVariable String mail) {
		return employeeService.findByMail(mail);
	}
}
