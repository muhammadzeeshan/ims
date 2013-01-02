package com.ims.webapp.exception;

public abstract class IMSException extends Exception {

	public IMSException(String message) {
		super(message);
	}

	public IMSException(String message, Throwable ex) {
		super(message, ex);
	}

}
