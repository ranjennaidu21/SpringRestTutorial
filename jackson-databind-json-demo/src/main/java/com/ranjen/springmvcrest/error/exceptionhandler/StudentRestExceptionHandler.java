package com.ranjen.springmvcrest.error.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ranjen.springmvcrest.error.exception.StudentNotFoundException;
import com.ranjen.springmvcrest.error.response.StudentErrorResponse;

@ControllerAdvice
public class StudentRestExceptionHandler {

	// add exception handling code here
	// Add an exception handler using @ExceptionHandler
	
	//Code in controller just throw the exception , but we need to handle the exception as below
	//Type of Response body = StudentErrorResponse
	//Exception type to handle or catch = StudentNotFoundException
	//to handle if user entered invalid or wrong id in correct integer format
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
		
		// create a StudentErrorResponse
		
		StudentErrorResponse error = new StudentErrorResponse();
		
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		// return ResponseEntity
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	//add another exception handler .. to catch any exception (catch all)
	// See the exception type , previously at above we use StudentNotFoundException, 
	//now just Exception for any exception that thrown
	//eg: to handle if user entered wrong and funny string character as id and not integer
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(Exception exc) {
		
		// create a StudentErrorResponse
		StudentErrorResponse error = new StudentErrorResponse();
		
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		// return ResponseEntity		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
}
