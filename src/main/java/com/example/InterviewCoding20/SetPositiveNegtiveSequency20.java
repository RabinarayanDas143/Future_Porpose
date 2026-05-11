package com.example.InterviewCoding20;

import java.util.Arrays;

public class SetPositiveNegtiveSequency20 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, -1, -2, -3, -4, -5 };
//		int[] result = new int[array.length];
//		int pos = 0, neg = 1;
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] > 0) {
//				result[pos] = array[i];
//				pos = pos + 2;
//			} else if (array[i] < 0) {
//				result[neg] = array[i];
//				neg = neg + 2;
//			}
//		}
//		System.out.println(Arrays.toString(result));

		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				j++;
			}
		}
		int pos = 1, neg = j;
		while (array.length > pos && array.length > neg) {
			int temp = array[pos];
			array[pos] = array[neg];
			array[neg] = temp;
			pos = pos + 2;
			neg++;
		}
		System.out.println(Arrays.toString(array));
	}
}
