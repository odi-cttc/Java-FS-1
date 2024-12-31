package com.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.validation.FieldError;


import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationExceptions(MethodArgumentNotValidException ex) {
        // Collect error messages in a list
        List<String> errorMessages = ex.getBindingResult().getAllErrors()
                .stream()
                .map(objectError -> {
                    String fieldName = ((FieldError) objectError).getField();
                    String message = objectError.getDefaultMessage();
                    return fieldName + ": " + message;  // Combine field name and error message
                })
                .collect(Collectors.toList());

        // Return the error response with 400 status code
        ErrorResponse errorResponse = new ErrorResponse(errorMessages);
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}

