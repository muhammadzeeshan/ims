package com.ims.restclient.Exception;

public class RestClientExeption extends Exception {

	public RestClientExeption(String message) {
		super(message);
	}

	public RestClientExeption(String message, Throwable ex) {
		super(message, ex);
	}

}
