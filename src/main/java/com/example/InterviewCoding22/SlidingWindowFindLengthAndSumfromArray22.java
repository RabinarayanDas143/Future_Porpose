package com.example.InterviewCoding22;

public class SlidingWindowFindLengthAndSumfromArray22 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int target = 20;

		int left = 0, sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			while (sum > target) {
				sum = sum - array[left];
				left++;
			}

			if (sum == target) {
				System.out.println("Traget is :" + target);
				for (int j = left; j <= i; j++) {
					System.out.print(array[j] + " ,");
				}
				return;
			}
		}
	}
}
