package com.example.coreJava1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPractice1 {
	public static void main(String[] args) {
		ExecutorService ea = Executors.newFixedThreadPool(2);
		ThreadPoolExecutor ex = new ThreadPoolExecutor(2, 4, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5));
		for (int i = 1; i <= 5; i++) {
			ex.submit(() -> {
				try {
					Thread.sleep(5000);
					System.out.println("Current Thread is :" + Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		}
		ex.shutdown();
	}
}
