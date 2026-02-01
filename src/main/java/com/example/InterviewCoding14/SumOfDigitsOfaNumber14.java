package com.example.InterviewCoding14;

public class SumOfDigitsOfaNumber14 {
	public static void main(String[] args) {
		int num = 123;
		int sum = 0;
		while (num != 0) {
			int d = num % 10;
			sum = sum + d;
			num = num / 10;
		}
		System.out.println("sum :" + sum);
	}
}
