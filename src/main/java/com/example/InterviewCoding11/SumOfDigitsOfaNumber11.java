package com.example.InterviewCoding11;

public class SumOfDigitsOfaNumber11 {
	public static void main(String[] args) {
		int num = 136;
		int sum = 0;
		while (num != 0) {
			int n = num % 10;
			sum += n;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
