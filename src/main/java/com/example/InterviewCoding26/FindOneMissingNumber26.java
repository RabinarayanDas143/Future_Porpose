package com.example.InterviewCoding26;

import java.util.Arrays;

public class FindOneMissingNumber26 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int n = Arrays.stream(array).max().getAsInt();
		int actualSum = n * (n + 1) / 2;
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		System.out.println(actualSum-sum);
	}
}
