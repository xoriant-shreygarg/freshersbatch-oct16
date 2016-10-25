package com.threads;

public class ThreadsUsingExtendsThread extends Thread {

	public static void main(String[] args) {
		Thread t1 = new ThreadsUsingExtendsThread("PING");
		Thread t2 = new ThreadsUsingExtendsThread("PONG");
		Thread t3 = new ThreadsUsingExtendsThread("TONG");
	}

	public ThreadsUsingExtendsThread(String name) {
		setName(name);
		if(name.equals("TONG"))
			setDaemon(true);
		start();
	}

	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		if (currentThread.getName().equals("PING")) {
			for (int i = 0; i < 10; i++) {
				System.out.println("PING");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} else if (currentThread.getName().equals("PONG")) {
			for (int i = 0; i < 10; i++) {
				System.out.println("\tPONG");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} else if (currentThread.getName().equals("TONG")) {
			for (;;) {
				System.out.println("\t\tTONG");
				try {
					Thread.sleep(150);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}