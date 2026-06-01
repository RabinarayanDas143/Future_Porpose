package com.example.InterviewCoding25;

public class PrimeNumberCheck25 {
	public static void main(String[] args) {
		int num = 3;
		boolean flag = true;
		if (num <= 1) {
			flag = false;
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0)
				flag = false;
		}

		if (flag)
			System.out.println("Given number is a prime number");
		else
			System.out.println("Given number is not a prime number");
	}
}
