package com.example.InterviewCoding20;

public class SlidingWindowFindLengthOfSubArray20 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int target = 20;
		int sum = 0, minLength = Integer.MAX_VALUE, left = 0, start = 0;
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
			System.out.println(0);
		} else {
			System.out.println(minLength);
		}

		for (int i = start; i < start + minLength; i++) {
			System.out.print(array[i] + ",");
		}
	}
}
