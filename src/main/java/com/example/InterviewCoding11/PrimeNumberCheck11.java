package com.example.InterviewCoding11;

public class PrimeNumberCheck11 {
	public static void main(String[] args) {
		int num = 7;
		String result = primeNumberCheck(num);
		System.out.println(result);
	}

	public static String primeNumberCheck(int num) {
		if (num <= 1) {
			return "Given number is not a Palindrom number.";
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (i % 2 == 0) {
				return "Given number is not a Palindrom number.";
			}
		}
		return "Given number is a Palindrom number.";
	}
}
