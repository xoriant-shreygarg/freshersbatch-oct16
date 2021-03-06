
package com.threads;

public class ThreadsUsingImplementsRunnable implements Runnable {

	Thread t1, t2, t3;

	public static void main(String[] args) {
		new ThreadsUsingImplementsRunnable();
	}

	public ThreadsUsingImplementsRunnable() {
		t1 = new Thread(this);
		t2 = new Thread(this);
		t3 = new Thread(this);
		t1.setName("PING");
		t2.setName("PONG");
		t3.setName("TONG");
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
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
