package com.dxctraining.usermodule.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CentralizedExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String handleUserNotFound(UserNotFoundException e) {
		String msg = e.getMessage();
		return msg;
	}

	@ExceptionHandler(InvalidArgumentException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String handleInvalidArgument(InvalidArgumentException e) {
		String msg = e.getMessage();
		return msg;
	}

}
