package com.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadsUsingExecutorFramework{

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/*
		Runnable r1 = new Runnable() {
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
		};
		Runnable r2 = new Runnable() {
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
		};
		Runnable r3 = new Runnable() {
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
		};
		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.execute(r1);
		executor.execute(r2);
		executor.execute(r3);
		*/
		
		Callable<Integer> c1 = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				for (int i = 0; i < 10; i++) {
					System.out.println("PING");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				return 1;
			}
		};
		Callable<Integer> c2 = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				for (int i = 0; i < 10; i++) {
					System.out.println("\tPONG");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				return 2;
			}
		};
		Callable<Integer> c3 = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				for (int i = 0; i < 10; i++) {
					System.out.println("\t\tTONG");
					try {
						Thread.sleep(150);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				return 3;
			}
		};
		ExecutorService executor = Executors.newFixedThreadPool(3);
		Future<Integer> future1 = executor.submit(c1);
		Future<Integer> future2 = executor.submit(c2);
		Future<Integer> future3 = executor.submit(c3);
		executor.shutdown();
		System.out.println("Future 1 = "+future1.get());
		System.out.println("Future 2 = "+future2.get());
		System.out.println("Future 3 = "+future3.get());
		
	}

}