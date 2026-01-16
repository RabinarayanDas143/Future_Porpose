package com.example.coreJava1;

interface MyInter {

	public void print();
}

public class AnnonymousClass1 {
	public static void main(String[] args) {
		MyInter an = new MyInter() {
			public void print() {
				System.out.println("This is a print method..");
			}
		};
	}
}
