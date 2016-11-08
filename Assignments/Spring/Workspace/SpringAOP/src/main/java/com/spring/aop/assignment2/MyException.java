package com.spring.aop.assignment2;

public class MyException extends Exception {
	
	String message;

	public MyException(String message) {
		this.message = message;
	}

	public MyException() {
		message = "";
	}
	
	

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "Exception occured." + message;
	}

}
