package com.example.InterviewCoding10;

public class SumOfDigitsOfaNumber19 {
	public static void main(String[] args) {
		int num = 136;
		int sum = 0;
		while (num != 0) {
			int n = num % 10;
			sum = sum + n;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
