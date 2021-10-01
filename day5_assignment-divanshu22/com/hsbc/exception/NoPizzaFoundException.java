package com.hsbc.exception;

@SuppressWarnings("all")
public class NoPizzaFoundException extends Exception {

	public NoPizzaFoundException() {
	}

	public NoPizzaFoundException(String message) {
		super(message);
	}
	

}
