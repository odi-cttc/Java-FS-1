package com.test;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQueries;
import jakarta.persistence.NamedStoredProcedureQuery;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureParameter;
import lombok.Data;

@Entity
@Data
@NamedStoredProcedureQueries(
	{
		@NamedStoredProcedureQuery(
				name = "Student.getStudents",
				procedureName = "getStudents",
				resultClasses = Student.class
		),
		@NamedStoredProcedureQuery(
				name = "Student.getById",
				procedureName = "getStudentById",
				resultClasses = Student.class,
				parameters = {
						@StoredProcedureParameter(name="id",type = Long.class,mode = ParameterMode.IN)
				}
		)
	})

public class Student {
	
	@Id
	private Long id;
	private String name;
	private int mark;
}
