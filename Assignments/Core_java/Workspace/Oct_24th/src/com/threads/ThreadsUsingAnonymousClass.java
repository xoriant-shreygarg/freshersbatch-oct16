package com.threads;

public class ThreadsUsingAnonymousClass{

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("PING");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("\tPONG");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (; ; ) {
					System.out.println("\t\tTONG");
					try {
						Thread.sleep(150);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
//		System.out.println(t1.hashCode());
//		System.out.println(t2.hashCode());
//		System.out.println(t3.hashCode());
//		t1.run();
//		t2.run();
	}

}