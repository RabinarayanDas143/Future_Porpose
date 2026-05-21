package com.example.InterviewCoding22;

import java.util.Arrays;

public class FindOneMissingNumber22 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int max = Arrays.stream(array).max().getAsInt();

		int actualSum = max * (max + 1) / 2;
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		int missing =  actualSum-sum;
		System.out.println(missing);
	}
}
