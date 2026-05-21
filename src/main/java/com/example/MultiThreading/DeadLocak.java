package com.example.MultiThreading;

public class DeadLocak {
	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Python";

		Thread t1 = new Thread(() -> {
			synchronized (str1) {
				System.out.println("Thread1 is calling..");
				synchronized (str2) {
					System.out.println("Inside thread1 method..");
				}
			}
		});

		Thread t2 = new Thread(() -> {
			synchronized (str2) {
				System.out.println("Threda2 is calling..");
				synchronized (str1) {
					System.out.println("Inside thread2 method");
				}
			}
		});

		t1.start();
		t2.start();
	}
}
