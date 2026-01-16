package com.example.InterviewCoding13;

import java.util.Arrays;

public class MergeTwoUnsortedArray13 {
	public static void main(String[] args) {
		int[] array1 = { 5, 2, 4, 3, 1 };
		int[] array2 = { 7, 6, 9, 8, 10 };
		int[] result = new int[array1.length + array2.length];
		int k = 0;
		for (int i : array1) {
			result[k] = i;
			k++;
		}
		for (int j : array2) {
			result[k] = j;
			k++;
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
