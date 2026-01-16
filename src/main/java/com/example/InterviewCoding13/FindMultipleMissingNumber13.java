package com.example.InterviewCoding13;

public class FindMultipleMissingNumber13 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 7, 9, 9, 10 };
		int last = array[array.length - 1];
		boolean[] original = new boolean[last + 1];
		for (int i : array) {
			if (i <= last) {
				original[i] = true;
			}
		}

		for (int i = 1; i <= last; i++) {
			if (!original[i]) {
				System.out.print(i + ",");
			}
		}
	}
}
