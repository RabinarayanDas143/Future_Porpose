package com.example.InterviewCoding14;

public class FibonaccieSeries14 {
	public static void main(String[] args) {
		int num = 10;
		int first = 0, last = 1;
		System.out.print(first + ", " + last);
		for (int i = 2; i <= num; i++) {
			int next = first + last;
			System.out.print(", " + next);
			first = last;
			last = next;
		}
	}
}
