/**
 * 
 */
package com.java.skillmanagement.dto;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
/**
 * @author 39912
 *
 */
@Component
public class ResponseDto {
	
	private HttpStatus responseCode;
	private String responseMessage;
	private Object data;

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

	public HttpStatus getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(HttpStatus responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public ResponseDto() {

	}

}
