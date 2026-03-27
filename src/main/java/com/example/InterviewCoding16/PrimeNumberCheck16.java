package com.example.InterviewCoding16;

public class PrimeNumberCheck16 {
	public static void main(String[] args) {
		int num = 4;
		boolean isPrime = true;
		if (num < 1) {
			isPrime = false;
		}
		for (int i = 2; i <=Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime)
			System.out.println("Given number is a Prime Number");
		else
			System.out.println("Given number is not a prime number");
	}
}
