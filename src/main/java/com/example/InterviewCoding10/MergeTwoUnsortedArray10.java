package com.example.InterviewCoding10;

import java.util.Arrays;

public class MergeTwoUnsortedArray10 {
	public static void main(String[] args) {
		int[] array1 = { 5, 2, 4, 3, 1 };
		int[] array2 = { 7, 6, 9, 8, 10 };
		int[] result = getResultArray(array1, array2);
		System.out.println(Arrays.toString(result));
	}

	private static int[] getResultArray(int[] array1, int[] array2) {
		int[] sortArray1 = getSortArray(array1);
		int[] sortArray2 = getSortArray(array2);
		int k = 0;
		int[] result = new int[array1.length + array2.length];
		for (int i : sortArray1) {
			result[k++] = i;
		}
		for (int i : sortArray2) {
			result[k++] = i;
		}
		return result;
	}

	private static int[] getSortArray(int[] array) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < array.length; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] > array[j]) {
						array[i] = array[i] + array[j];
						array[j] = array[i] - array[j];
						array[i] = array[i] - array[j];
						swapped = true;
					}
				}
			}
		} while (swapped);
		return array;
	}
}
