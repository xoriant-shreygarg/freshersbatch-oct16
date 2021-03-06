package com.exceptions;

class MyAutoCloseable implements AutoCloseable{
	int value;
	
	public MyAutoCloseable(int value) {
		this.value = value;
	}
	
	public void setValue(int value) throws Exception  {
		if(value==1)
			throw new Exception();
		this.value = value;
	}

	@Override
	public void close() throws Exception {
		System.out.println("Close() called.");
	}
}


public class Exception3 {
	
	public static void main(String[] args) {
		try(MyAutoCloseable m = new MyAutoCloseable(2)){
			m.setValue(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}


