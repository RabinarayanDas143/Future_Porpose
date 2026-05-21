package com.example.InterviewCoding23;

public class PrimeNumberCheck23 {
	public static void main(String[] args) {
		int num = 5;
		boolean flag = true;

		if (num <= 1)
			flag = false;

		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}

		if (flag)
			System.out.println("Given Number is a prime number");
		else
			System.out.println("Given Number is not a prime number");
	}
}
