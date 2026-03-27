package com.example.InterviewCoding16;

import java.util.Arrays;

public class RotateArrayFromLeftFromKthDSA16 {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		int k = 2;
		int n = array.length;
		k = k % n;

		doRotateFromLeft(array, 0, k - 1);
		doRotateFromLeft(array, k, n - 1);
		doRotateFromLeft(array, 0, n - 1);

		System.out.println(Arrays.toString(array));
	}

	private static void doRotateFromLeft(int[] array, int i, int j) {
		while (i < j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
	}
}
