package com.example.demo.service.exception;

public class SubscriptionException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public SubscriptionException() {
		
	}
	
	public SubscriptionException(String messageException) {
		super(messageException);
	}
	
	public SubscriptionException(String messageException, Throwable throwable) {
		super(messageException, throwable);
	}
}
