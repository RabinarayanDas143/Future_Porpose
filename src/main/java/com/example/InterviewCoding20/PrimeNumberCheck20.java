package com.example.InterviewCoding20;

public class PrimeNumberCheck20 {
	public static void main(String[] args) {
		int num = 3;
		boolean flag = true;
		if (num <= 1)
			flag = false;
		
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num%i == 0) {
				flag = false;
				break;
			}
		}

		if (flag)
			System.out.println("Given number is a prime");
		else
			System.out.println("Given number is not a prime");
	}
}
