package com.example.InterviewCoding27;

public class SlidingWindowFindLengthAndSumfromArray27 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int target = 20;
		int sum = 0, left = 0,minLength=Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			while (sum > target) {
				sum = sum - array[left];
				left++;
			}
			if (sum == target) {
				minLength = i-left+1;
				System.out.println(minLength);
				for (int j = left; j <= i; j++) {
					System.out.print(array[j] + ",");
				}
				return;
			}
		}
	}
}
