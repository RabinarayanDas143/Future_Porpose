package com.example.InterviewCoding15;

public class FindOneMissingNumber15 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int last = array[array.length - 1];
		int actualSum = last * (last + 1) / 2;
		int inputSum = 0;
		for (int i : array) {
			inputSum = inputSum + i;
		}
		int missing = actualSum-inputSum;
		System.out.println(missing);
	}
}
