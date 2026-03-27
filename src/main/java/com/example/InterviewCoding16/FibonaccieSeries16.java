package com.example.InterviewCoding16;

public class FibonaccieSeries16 {
	public static void main(String[] args) {
		int num = 10;
		int first = 0, second = 1;
		System.out.print(first + " ," + second);
		for (int i = 2; i <= num; i++) {
			int next = first + second;
			System.out.print("," + next);
			first = second;
			second = next;
		}
	}
}
