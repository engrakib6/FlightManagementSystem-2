package com.dxctraining.airportmgt.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CentralizedExceptionHandler {

	@ExceptionHandler(AirportNullException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String handleAirportNull(AirportNullException e) {
		String msg = e.getMessage();
		return msg;
	}

	@ExceptionHandler(InvalidAirportCodeException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String handleInvalidAirportCode(InvalidAirportCodeException e) {
		String msg = e.getMessage();
		return msg;
	}
    
	@ExceptionHandler(AirportNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handleAirportNotFound(AirportNotFoundException e) {
		String msg = e.getMessage();
		return msg;
	}
}
