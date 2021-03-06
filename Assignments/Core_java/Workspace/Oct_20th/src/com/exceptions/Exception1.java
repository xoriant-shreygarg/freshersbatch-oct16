package com.exceptions;

class MyException extends Exception{
	
	String message;

	public MyException(String message) {
		this.message = message;
	}

	public MyException() {
		message = "";
	}

	@Override
	public String toString() {
		return "Exception occured." + message;
	}
}

class MyException2 extends Exception{
	
	String message;

	public MyException2(String message) {
		this.message = message;
	}

	public MyException2() {
		message = "";
	}

	@Override
	public String toString() {
		return "Exception occured." + message;
	}
}

class A{
	public static void print() throws MyException{
		System.out.println("Throwing exception");
		throw new MyException();
	}
	public static void print2() throws MyException2{
		System.out.println("Throwing exception 2");
		throw new MyException2();
	}
}

public class Exception1 {
	
	public static void main(String[] args) /*throws MyException*/ {
		
		/*
		try {
			A.print();
		} catch (MyException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*
		try {
			try {
				A.print2();
			} catch (MyException2 e) {
				e.printStackTrace();
			}
			A.print();
		} catch (MyException e) {
			e.printStackTrace();
		}
		*/
		
		/*
		try {
			A.print();
		} catch (MyException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally!");
		}
		*/
		
		/*
		try {
			A.print();
		} finally {
			System.out.println("Finally!");
		}
		*/
	}

}
