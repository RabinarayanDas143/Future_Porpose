package com.example.MultiThreading;

public class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("Run methodd");
	}
	 
	public static void main(String[] args) {
		MyRunnable obj = new MyRunnable();
		Thread t1 = new Thread(obj);
		t1.start();
	}

}
