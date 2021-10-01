package com.hsbc.exception;

@SuppressWarnings("all")
public class PizzaAlreadyExistsException extends Exception {

	public PizzaAlreadyExistsException() {
	}

	public PizzaAlreadyExistsException(String message) {
		super(message);
	}
	
}
