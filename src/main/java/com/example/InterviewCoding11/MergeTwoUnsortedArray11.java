package com.example.InterviewCoding11;

import java.util.Arrays;

public class MergeTwoUnsortedArray11 {
	public static void main(String[] args) {
		int[] array1 = { 5, 2, 4, 3, 1 };
		int[] array2 = { 7, 6, 9, 8, 10 };
		int[] result = getResultArray(array1, array2);
		System.out.println(Arrays.toString(result));
	}

	public static int[] getResultArray(int array1[], int array2[]) {
		int result[] = new int[array1.length + array2.length];
		int k = 0;
		for (int i : array1) {
			result[k++] = i;
		}
		for (int i : array2) {
			result[k++] = i;
		}
		
		boolean swap;
		do {
			swap = false;
			for (int i = 0; i < result.length; i++) {
				for (int j = i + 1; j < result.length; j++) {
					if (result[i] > result[j]) {
						result[i] = result[i] + result[j];
						result[j] = result[i] - result[j];
						result[i] = result[i] - result[j];
						swap = true;
					}
				}
			}
		} while (swap);
		return result;
	}
}
