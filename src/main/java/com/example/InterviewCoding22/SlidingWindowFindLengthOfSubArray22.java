package com.example.InterviewCoding22;

public class SlidingWindowFindLengthOfSubArray22 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int target = 20;

		int left = 0, sum = 0, minLength = Integer.MAX_VALUE, start = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			while (sum >= target) {
				int length = i - left + 1;
				if (length < minLength) {
					minLength = length;
					start = left;
				}
				sum = sum - array[left];
				left++;
			}
		}

		if (minLength == Integer.MAX_VALUE) {
			System.out.println("SubArray is not found");
		} else {
			System.out.println("Target is :" + target);
			for (int i = start; i < start + minLength; i++) {
				System.out.print(array[i] + " ,");
			}
		}
	}
}
