package com.ims.restclient.Exception;

public class EmptyBodyException extends RestClientException{

	public EmptyBodyException(String message) {
		super(message);

	}
	public EmptyBodyException(String message, Throwable ex) {
		super(message,ex);
	}

}
