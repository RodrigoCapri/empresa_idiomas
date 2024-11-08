package com.api.idiomas.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.api.idiomas.services.exceptions.DatabaseExceptions;
import com.api.idiomas.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

/**
 * Handles exceptions thrown by the application.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

@ControllerAdvice
public class ResourceExceptionHandler {

	/**
	 * Handles {@link ResourceNotFoundException} by returning a 404 error with a {@link StandardError} containing the error message.
	 * @param e the exception to handle
	 * @param request the current HTTP request
	 * @return a ResponseEntity with a 404 status and a {@link StandardError} in the body
	 */
    @ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		String error = "Resource not found!";
		HttpStatus status = HttpStatus.NOT_FOUND; //Não encontrado 404
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	

	/**
	 * Handles {@link DatabaseExceptions} by returning a 400 error with a {@link StandardError} containing the error message.
	 * @param e the exception to handle
	 * @param request the current HTTP request
	 * @return a ResponseEntity with a 400 status and a {@link StandardError} in the body
	 */
	@ExceptionHandler(DatabaseExceptions.class)
	public ResponseEntity<StandardError> database(DatabaseExceptions e, HttpServletRequest request){
		String error = "Database error";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}

}
