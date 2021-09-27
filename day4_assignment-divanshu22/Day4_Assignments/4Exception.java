package com.hsbc.day4.exception;

import java.util.Arrays;

public class InvalidRangeException extends Exception {
	private int age;

	public InvalidInputException() {
		super();

	}

	public InvalidInputException(int age) {
		this.age = age;

	}

	public InvalidInputException(String message, int age) {
		super(message);

	}

	public InvalidInputException(String message, int age, Throwable cause) {
		super(message, cause);

	}

	@Override
	public String toString() {
		return "InvalidInputException [age=" + age + ", getMessage()=" + getAge() + "]";
	}

	public int getAge() {
		return age;
	}

}
