package com.test;

import java.util.List;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student, Long>{

	@Procedure(name = "Student.getStudents")
	List<Student> getStudents();

	@Procedure(name = "Student.getById")
	Student getStudentById(Long id);

}
