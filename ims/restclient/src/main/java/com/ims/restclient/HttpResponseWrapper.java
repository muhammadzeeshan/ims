package com.ims.restclient;

import java.io.ByteArrayOutputStream;

public class HttpResponseWrapper {
	
	
	
	private int statusCode;
	private String statusPhrase;
	private ByteArrayOutputStream body;

	public HttpResponseWrapper() {
	}

	public HttpResponseWrapper(int status, String phrase) {
		this.statusCode = status;
		this.statusPhrase = phrase;
	}

	
	public ByteArrayOutputStream getBody() {
		return body;
	}

	public void setBody(ByteArrayOutputStream body) {
		this.body = body;
	}

	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusPhrase() {
		return statusPhrase;
	}
	public void setStatusPhrase(String statusPhrase) {
		this.statusPhrase = statusPhrase;
	}

	
	
		
}
