package com.example.MultiThreading;

public class MyRunnable1 {
	public static void main(String[] args) {
		Runnable obj = ()->System.out.println("Functional Interface call");

		Thread t = new Thread(obj);
		t.start();
	}
}
