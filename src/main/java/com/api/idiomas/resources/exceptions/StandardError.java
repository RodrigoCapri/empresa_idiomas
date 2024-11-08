package com.api.idiomas.resources.exceptions;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Class that represents a standard error returned by the API.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

public class StandardError {
	
	@JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant timestamp;
	
	private Integer status;
	private String error;
	private String message;
	private String path;
	
	public StandardError() {
	}

	public StandardError(Instant timestamp, Integer status, String error, String message, String path) {
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.message = message;
		this.path = path;
	}

	/**
	 * Returns the timestamp of when the error occurred, in ISO 8601 format, i.e.
	 * {@code yyyy-MM-dd'T'HH:mm:ss'Z'}.
	 * 
	 * @return the timestamp of when the error occurred
	 */
	public Instant getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the timestamp of when the error occurred, in ISO 8601 format, i.e.
	/**
	 * Returns the HTTP status code associated with the error.
	 * 
	 * @return the HTTP status code
	 */
	public Integer getStatus() {
		return status;
	}

    /**
     * Sets the HTTP status code associated with the error.
     *
	 * Returns the error message associated with the error.
	 * 
	 * @return the error message
	 */
	public String getError() {
		return error;
	}

	/**
	 * Sets the error message associated with the error.
	 *
	 * Returns the error message associated with the error.
	 * 
	 * @return the error message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the error message associated with the error.
	 *
	 * Returns the request path associated with the error.
	 * 
	 * @return the request path
	 */
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
