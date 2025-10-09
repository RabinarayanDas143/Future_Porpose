package com.example.InterviewCoding10;

public class FactorialsNumber10 {
	public static void main(String[] args) {
		int num = 10;
		int factorialNumber = getFactorialNUmber(num);
		System.out.println("factorialNumber is :" + factorialNumber);
	}

	private static int getFactorialNUmber(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
