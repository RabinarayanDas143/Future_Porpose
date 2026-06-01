package com.example.InterviewCoding24;

public class SlidingWindowFindLengthAndSumfromArray24 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int target = 20;

		int sum = 0, left = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			while (sum > target) {
				sum = sum - array[left];
				left++;
			}
			if (sum == target) {
				for (int j = left; j <= i; j++) {
					System.out.print(array[j] + ",");
				}
			}
		}
	}
}
