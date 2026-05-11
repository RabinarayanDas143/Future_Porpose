package com.example.InterviewCoding19;

import java.util.Arrays;

public class MergeTwoUnsortedArray19 {
	public static void main(String[] args) {
		int[] array1 = { 5, 4, 3, 2, 1 };
		int[] array2 = { 6, 9, 7, 8, 10 };
		int[] array = new int[array1.length + array2.length];
		int k = 0;
		for (int i : array1) {
			array[k++] = i;
		}
		for (int j : array2) {
			array[k++] = j;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
	}
}
