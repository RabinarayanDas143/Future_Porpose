package com.example.InterviewCoding13;

import java.util.Arrays;

public class FindKthLargestNumberFromArray13 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 3, 6, 9, 8, 7, 10 };
		int Kth = 3;
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
			if (i == Kth - 1) {
				result = array[i];
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println(result);
	}
}
