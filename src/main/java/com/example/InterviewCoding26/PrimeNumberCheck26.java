package com.example.InterviewCoding26;

public class PrimeNumberCheck26 {
	public static void main(String[] args) {
		int num = 3;
		boolean flag = true;
		if (num <= 1)
			flag = false;

		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0)
				flag = false;
		}

		if (flag) {
			System.out.println("Given number is a prime number");
		} else {
			System.out.println("Given numer is not a prime number");
		}
	}
}
