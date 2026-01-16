package com.example.InterviewCoding12;

public class FindOneMissingNumber12 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int n = array.length+1;
		int expected = n * (n + 1) / 2;
		int actualSum = 0;
		for (int i : array) {
			actualSum += i;
		}
		int missing = expected - actualSum;
		System.out.println("Missing is :" + missing);
	}
}
