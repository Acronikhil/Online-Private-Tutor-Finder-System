package com.optfs.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.http.HttpStatus;

@RestControllerAdvice
public class UserControllerAdvice {

	@ExceptionHandler(NullUserFound.class)
	@ResponseStatus(HttpStatus.BAD_GATEWAY)
	String nullUserFoundException(NullUserFound nufe) {
		return nufe.getMessage();
	}
	
	@ExceptionHandler(UserIdCannotBeNull.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	String nullUserIdFoundException(UserIdCannotBeNull uidcnn) {
		return uidcnn.getMessage();
	}
}
