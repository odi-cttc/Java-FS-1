package com.cttc.emp;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public ResponseEntity<Object> saveEmployee(@RequestBody Employee employee) {
		Employee saveEmployee = employeeService.saveEmployee(employee);
		Map<String, Object> responseMap = new LinkedHashMap<String, Object>();
		responseMap.put("status", "success");
		responseMap.put("message", "Data Inserted Success! for ID : "+saveEmployee.getId());
		responseMap.put("data",saveEmployee);
		return new ResponseEntity<Object>(responseMap, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/findAll")
	public List<Employee> getAllEmp(){
		return employeeService.getAllEmp();
	}
	
	@GetMapping("findById/{id}")
	public Employee findById(@PathVariable Long id) {
		return employeeService.findById(id);
	}
	
	@DeleteMapping("delete/{id}")
	public Employee deleteById(@PathVariable Long id) {
		return employeeService.deleteById(id);
	}
	
	@PutMapping("/edit/{id}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable Long id) {
		return employeeService.updateEmployee(employee,id);
	}
}
