package com.tcs.pms.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandling {
	
	@ExceptionHandler
	public ResponseEntity<Map> RunTimeExceptionHandler(RuntimeException e){
		Map<String,String> m=new HashMap<>();
		m.put("errorCode", "101");
		m.put("errorMessage", e.getMessage());
		m.put("details", "Given Employee id is invalid or not found");
		return new ResponseEntity<>(m,HttpStatus.OK);
	}
      
	
}
