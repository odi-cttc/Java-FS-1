package com.test.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.ValidationErrorResponse;

import jakarta.validation.Valid;

@RestController
public class UserController {
	
	@PostMapping("/save")
	public ResponseEntity<Object> save(@Valid @RequestBody User user, BindingResult result) {
		
		 if (result.hasErrors()) {
	            List<ValidationErrorResponse.FieldErrorDetail> errors = new ArrayList<>();
	            for (FieldError error : result.getFieldErrors()) {
	                // Add each field error to the list
	                errors.add(new ValidationErrorResponse.FieldErrorDetail(error.getField(), error.getDefaultMessage()));
	            }

	            // Create a structured error response
	            ValidationErrorResponse errorResponse = new ValidationErrorResponse(errors);

	            // Return the error response in JSON format with a 400 BAD_REQUEST status
	            return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	        }
		return new ResponseEntity<Object>(result, HttpStatus.OK);
	}
}
