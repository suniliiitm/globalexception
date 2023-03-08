package com.sp.globalexception.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class RestExceptionHandler {
	//GlobalException  Handling in Rest Controller
	
	@ExceptionHandler(value= ProductNotFoundException.class)
	public ResponseEntity<ApiError>  handleProductNotFoundException() {
		
		ApiError error=new ApiError(400, "No Product Found", new Date());
		return new ResponseEntity<ApiError>(error,HttpStatus.BAD_REQUEST);
	}

}
