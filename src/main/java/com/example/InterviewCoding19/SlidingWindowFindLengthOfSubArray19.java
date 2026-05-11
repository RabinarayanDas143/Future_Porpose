package com.example.InterviewCoding19;

public class SlidingWindowFindLengthOfSubArray19 {
	public static void main(String[] args) {
		int[] array = { 2, 3, 1, 2, 4, 3 };
		int target = 9;
		int sum = 0, minlenght = Integer.MAX_VALUE, left = 0, start = 0;
		for (int right = 0; right < array.length; right++) {
			sum = sum + array[right];
			while (sum >= target) {
				int length = right - left + 1;
				if (length < minlenght) {
					minlenght = length;
					start = left;
				}
				sum = sum - array[left];
				left++;
			}
		}
		if (minlenght == Integer.MAX_VALUE)
			System.out.println(0);
		else
			System.out.println(minlenght);

		for (int i = start; i < start + minlenght; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
