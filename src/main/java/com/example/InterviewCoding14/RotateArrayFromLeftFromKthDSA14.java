package com.example.InterviewCoding14;

import java.util.Arrays;

public class RotateArrayFromLeftFromKthDSA14 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int k = 7;
		rotateLeft(array, k);
		
		System.out.println(Arrays.toString(array));
	}

	private static void rotateLeft(int[] array, int k) {
		int n = array.length;
		k = k % n; //This ensures k is within bounds.
		doReverse(array, 0, k - 1); //[1,2] → [2,1]
		doReverse(array, k, n - 1); // [3,4,5] → [5,4,3]
		doReverse(array, 0, n - 1);  // [2, 1, 5, 4, 3]
		                             //    ↓
		                             // [3, 4, 5, 1, 2]
	}

	private static void doReverse(int[] array, int i, int j) {
		while (i < j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
	}
}
