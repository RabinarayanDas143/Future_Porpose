package com.example.InterviewCoding12;

public class SumOfDigitsOfaNumber12 {
	public static void main(String[] args) {
		int num = 136;
		int sum = 0;
		while (num != 0) {
			int d = num % 10;
			sum = sum + d;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
