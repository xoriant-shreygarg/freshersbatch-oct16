package com.threads;


class A extends MyThread{
	@Override
	public void run() {
		System.out.println("Hello from A");
	}
}
class B extends MyThread{
	@Override
	public void run() {
		System.out.println("Hello from B");
	}
}


public class Test {
	public static void main(String[] args) {
		Thread t = new Thread(new B());
//		A t = new A();
//		MyThread t = new B();
		t.start();
	}
}

class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}


	
}