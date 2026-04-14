package com.example.InterviewCoding18;

public class SlidingWindowFindLengthOfSubArray18 {
	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 2, 4, 3 };
		int target = 7;

		int left = 0; // start of window
		int sum = 0; // current window sum
		int minLength = Integer.MAX_VALUE; // to store minimum length

		// right pointer will move from 0 to end
		for (int right = 0; right < nums.length; right++) {

			sum += nums[right]; // ➡️ STEP 1: add current element (expand window)

			// ➡️ STEP 2: check if condition satisfied
			while (sum >= target) {

				int length = right - left + 1; // calculate window size

				// update minimum length
				if (length < minLength) {
					minLength = length;
				}

				// ➡️ STEP 3: shrink window from left
				sum -= nums[left];
				left++; // move left pointer
			}
		}

		// if no subarray found, return 0
		if (minLength == Integer.MAX_VALUE) {
			System.out.println(0);
		}

		System.out.println("minLength :" + minLength);
	}
}
