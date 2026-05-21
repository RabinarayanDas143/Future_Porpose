package com.example.InterviewCoding23;

import java.util.Arrays;

public class RotateArrayFromLeftFromKthDSA23 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int k = 4;
		int n = array.length-1;
		k = k % n;

		doSort(array, 0, k - 1);
		doSort(array, k, n);
		doSort(array, 0, n);
		
		System.out.println(Arrays.toString(array));
	}

	private static void doSort(int[] array, int i, int j) {
		while (i < j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
	}
}
