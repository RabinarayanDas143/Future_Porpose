package com.example.coreJava1;

public class AnnonymousWithThread1 {
	public static void main(String[] args) {
		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Run Method is called");
			}
		});
		th.start();
	}
}
