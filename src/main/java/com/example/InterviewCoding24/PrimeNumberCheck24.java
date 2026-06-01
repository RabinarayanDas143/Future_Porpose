package com.example.InterviewCoding24;

public class PrimeNumberCheck24 {
	public static void main(String[] args) {
		int num = 5;
		boolean flag = true;
		if (num <= 1) {
			flag = false;
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}

		if (flag)
			System.out.println("Prime number");
		else
			System.out.println("Not prime");
	}
}
