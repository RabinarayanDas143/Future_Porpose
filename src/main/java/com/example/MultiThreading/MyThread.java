package com.example.MultiThreading;

public class MyThread extends Thread {
	public void run() {
		System.out.println("Method is execute..");
	}

	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.start();
	}
}
