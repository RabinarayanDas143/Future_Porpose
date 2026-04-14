package com.example.InterviewCoding18;

public class FindOneMissingNumber18 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int last = array[array.length - 1];
		int actualSum = last * (last + 1) / 2;
		int givenSum = 0;
		for (int i : array) {
			givenSum += i;
		}
		int missing = actualSum - givenSum;
		System.out.println(missing);
	}
}
