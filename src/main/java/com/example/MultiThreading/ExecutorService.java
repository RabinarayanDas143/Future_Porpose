package com.example.MultiThreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorService {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		java.util.concurrent.ExecutorService ex = Executors.newFixedThreadPool(3);
//		for (int i = 1; i <= 5; i++) {
//
//			int num = i;
//
//			ex.submit(() -> {
//				System.out.println(Thread.currentThread().getName() + " " + num);
//			});
//		}
//		ex.shutdown();

		System.out.println("Main thread");
		java.util.concurrent.ExecutorService ex1 = Executors.newCachedThreadPool();
		Future<?> future=ex1.submit(() -> System.out.println("Call method is call"));
		future.get();
		Thread.sleep(2000);
		System.out.println("Call method is complete");
	}
}
