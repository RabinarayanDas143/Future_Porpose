package com.example.InterviewCoding14;

public class PrimeNumberCheck14 {
	public static void main(String[] args) {
		int num = 2;
		if (num <= 1) {
			System.out.println("Given number is not a prime number.");
		}
		for (int i = 2; i < Math.sqrt(i); i++) {
			if (i % 2 == 0) {
				System.out.println("Given number is not a prime number.");
			}
		}
		System.out.println("Given number is a prime number..");
	}
}
