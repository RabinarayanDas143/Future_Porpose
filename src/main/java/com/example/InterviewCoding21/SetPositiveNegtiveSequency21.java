package com.example.InterviewCoding21;

import java.util.Arrays;

public class SetPositiveNegtiveSequency21 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, -1, -2, -3, -4, -5, 4, 5 };
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				j++;
			}
		}
System.out.println(Arrays.toString(array));
		int pos = 1;
		int neg = j;
		while (pos < array.length && neg < array.length) {
			int temp = array[pos];
			array[pos] = array[neg];
			array[neg] = temp;
			pos = pos + 2;
			neg++;
		}
		System.out.println(Arrays.toString(array));

//		int pos = 0, neg = 1;
//		int[] result = new int[array.length];
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
	}
}
