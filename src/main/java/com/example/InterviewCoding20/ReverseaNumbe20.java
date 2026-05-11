package com.example.InterviewCoding20;

public class ReverseaNumbe20 {
	public static void main(String[] args) {
		int num = 123;
		int sum = 0;
		while (num != 0) {
			int d = num % 10;
			sum = sum * 10 + d;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
