package com.example.InterviewCoding13;

public class FindOneMissingNumber13 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int last = array[array.length - 1];
		System.out.println(last);
		int expected = last * (last + 1) / 2;
		int actualSum = 0;
		for (int i : array) {
			actualSum += i;
		}
		int missing = expected-actualSum;
		System.out.println(missing);
	}
}
