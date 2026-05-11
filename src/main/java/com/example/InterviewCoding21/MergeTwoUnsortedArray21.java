package com.example.InterviewCoding21;

import java.util.Arrays;

public class MergeTwoUnsortedArray21 {
	public static void main(String[] args) {
		int[] array1 = { 5, 4, 3, 2, 1 };
		int[] array2 = { 10, 9, 8, 7, 6 };
		int[] array = new int[array1.length + array2.length];
		int k = 0;
		for (int i : array1) {
			array[k++] = i;
		}
		for (int i : array2) {
			array[k++] = i;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
