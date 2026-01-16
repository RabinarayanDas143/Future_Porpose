package com.example.InterviewCoding12;

public class PrimeNumberCheck12 {
	public static void main(String[] args) {
		int num = 4;
		if (num <= 1) {
			System.out.println("Given number is not a Palindrom number.");
		}
		for (int i = 2; i <= Math.sqrt(i); i++) {
			if (i % 2 == 0) {
				System.out.println("Given number is not a Palindrom number.");
			}
		}
		System.out.println("Given number is a palindrom number..");
	}
}
