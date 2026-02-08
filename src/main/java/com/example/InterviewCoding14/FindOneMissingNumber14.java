package com.example.InterviewCoding14;

public class FindOneMissingNumber14 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int last = array[array.length - 1];
		int actualSum = last * (last + 1) / 2;
		int inputSum = 0;
		for (int i : array) {
			inputSum += i;
		}
		int missing = actualSum-inputSum;
		System.out.println(missing);
	}
}
