package com.example.InterviewCoding15;

import java.util.Arrays;

public class RotateArrayFromRightFromKthDSA15 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int k = 2;
		int n = array.length;
		k = k % n;

		doRotateFromRight(array, 0, n - 1);
		doRotateFromRight(array, 0, k - 1);
		doRotateFromRight(array, k, n - 1);
		
		System.out.println(Arrays.toString(array));
	}

	private static void doRotateFromRight(int[] array, int i, int j) {
		while (i < j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
	}
}
