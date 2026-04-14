package com.example.InterviewCoding18;

public class PrimeNumberCheck18 {
	public static void main(String[] args) {
		int num = 3;
		boolean flag = true;
		if (num <= 1)
			flag = false;

		for (int i = 2; i < Math.sqrt(num); i++) {
			if (i % 2 == 0)
				flag = false;
		}

		if (flag)
			System.out.println("Given number is a Palindrom number");
		else
			System.out.println("Gievn number is not a palindrom number");
	}
}
