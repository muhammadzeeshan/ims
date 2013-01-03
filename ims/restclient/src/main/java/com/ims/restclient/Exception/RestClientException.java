package com.ims.restclient.Exception;

public class RestClientException extends Exception {

	public RestClientException(String message) {
		super(message);
	}

	public RestClientException(String message, Throwable ex) {
		super(message, ex);
	}

}
