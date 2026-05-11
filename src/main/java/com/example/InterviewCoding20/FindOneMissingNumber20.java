package com.example.InterviewCoding20;

import java.util.Arrays;

public class FindOneMissingNumber20 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int n = Arrays.stream(array).max().getAsInt();
		int ActualSum = n * (n + 1) / 2;
		int givenSum = 0;
		for (int i = 0; i < array.length; i++) {
			givenSum = givenSum + array[i];
		}
		int missing = ActualSum - givenSum;
		System.out.println(missing);
	}
}
