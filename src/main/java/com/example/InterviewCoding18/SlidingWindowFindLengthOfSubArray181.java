package com.example.InterviewCoding18;

public class SlidingWindowFindLengthOfSubArray181 {
	public static void main(String[] args) {
		int[] num = { 2, 3, 1, 2, 4, 3 };
		int target = 7;

		int left = 0;
		int sum = 0;
		int minLength = Integer.MAX_VALUE;
		int start = 0;
		for (int right = 0; right < num.length; right++) {
			sum = sum + num[right];
			while (sum >= target) {
				int length = right - left + 1;
				if (length < minLength) {
					minLength = length;
					start = left;
				}
				sum = sum - num[left];
				left++;

			}
		}

		if (minLength == Integer.MAX_VALUE)
			System.out.println(0);
		else
			System.out.println(minLength);

		for (int i = start; i < start + minLength; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
