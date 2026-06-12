package com.example.InterviewCoding26;

public class AmstrongNumber26 {
	public static void main(String[] args) {
		int num = 153;
		int actual = num;
		int sum = 0;
		while (num != 0) {
			int d = num % 10;
			sum += d * d * d;
			num = num / 10;
		}
		if (sum == actual)
			System.out.println("Amstrong");
		else
			System.out.println("NOT");
	}
}
