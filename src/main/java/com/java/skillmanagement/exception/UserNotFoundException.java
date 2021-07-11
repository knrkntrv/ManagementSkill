/**
 * 
 */
package com.java.skillmanagement.exception;
import org.springframework.http.HttpStatus;  
import org.springframework.web.bind.annotation.ResponseStatus; 

/**
 * @author 39912
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND) 
public class UserNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7323496930795988693L;

	public UserNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
