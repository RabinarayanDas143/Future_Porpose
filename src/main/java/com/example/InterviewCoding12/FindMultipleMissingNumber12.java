package com.example.InterviewCoding12;

public class FindMultipleMissingNumber12 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 7, 9, 9, 10 };
		int last = 10;
		boolean present[] = new boolean[last + 1];
		for (int num : array) {
			if (num <= last) {
				present[num] = true;
			}
		}
		System.out.print("Missing numbers: ");
		for (int i = 1; i <= last; i++) {
			if (!present[i]) {
				System.out.print(i + " ");
			}
		}
	}
}
