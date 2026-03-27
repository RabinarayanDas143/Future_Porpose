package com.example.InterviewCoding15;

public class PrimeNumberCheck15 {
	public static void main(String[] args) {
		int num = 7;
		boolean isPrime = true;
		if (num < 1) {
			isPrime = false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
            System.out.println("Given number is a prime number.");
        else
            System.out.println("Given number is not a prime number.");
	}
}
