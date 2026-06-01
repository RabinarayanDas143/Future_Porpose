package com.example.InterviewCoding24;

public class SlidingWindowFindLengthOfSubArray24 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int target = 20;

		int left = 0, minLength = Integer.MIN_VALUE, sum = 0, start = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			while (sum >= target) {
				int length = i - left + 1;
				if (length > minLength) {
					minLength = length;
					start = left;
				}
				sum = sum - array[left];
				left++;
			}
		}

		if (minLength == Integer.MIN_VALUE) {
			System.out.println("Sub array not found");
		} else {
			for (int i = start; i < start + minLength; i++) {
				System.out.print(array[i] + ",");
			}
		}
	}
}
