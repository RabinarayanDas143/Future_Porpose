package com.example.InterviewCoding10;

public class PrimeNumberCheck10 {
	public static void main(String[] args) {
		int num = 7;
		String result = primeNumberCheck(num);
		System.out.println(result);
	}

	private static String primeNumberCheck(int num) {
		if (num <= 1) {
			return "Given number is not a palindrom.";
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % 2 == 0) {
				return "Given number is not a prime number";
			}
		}
		return "Given number is a prime number";
	}
}
