package com.example.InterviewCoding20;

import java.util.Arrays;

public class RotateArrayFromRightFromKthDSA20 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int k = 3;
		int n = array.length - 1;
		k = k % n;

		doRotate(array, 0, n);
		doRotate(array, 0, k - 1);
		doRotate(array, k, n);
		
		System.out.println(Arrays.toString(array));
	}

	private static void doRotate(int[] array, int i, int j) {
		while (i < j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
	}
}
