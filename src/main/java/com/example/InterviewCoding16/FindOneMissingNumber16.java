package com.example.InterviewCoding16;

public class FindOneMissingNumber16 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int last = array[array.length - 1];
		int actualSum = last * (last + 1) / 2;
		int givenSum = 0;
		for (int i : array) {
			givenSum = givenSum + i;
		}
		System.out.println(actualSum - givenSum);
	}
}
