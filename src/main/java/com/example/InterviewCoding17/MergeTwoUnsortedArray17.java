package com.example.InterviewCoding17;

import java.util.Arrays;

public class MergeTwoUnsortedArray17 {
	public static void main(String[] args) {
		int[] array1 = { 5, 4, 3, 2, 1 };
		int[] array2 = { 10, 9, 8, 7, 6 };
		int result[] = new int[array1.length + array2.length];
		int k = 0;
		for (int i : array1) {
			result[k++] = i;
		}

		for (int i : array2) {
			result[k++] = i;
		}

		for (int i = 0; i < result.length; i++) {
			for (int j = i + 1; j < result.length; j++) {
				if (result[i] > result[j]) {
					result[i] = result[i] + result[j];
					result[j] = result[i] - result[j];
					result[i] = result[i] - result[j];
				}
			}
		}

		System.out.println(Arrays.toString(result));
	}
}
