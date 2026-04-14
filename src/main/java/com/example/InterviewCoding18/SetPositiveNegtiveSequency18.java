package com.example.InterviewCoding18;

import java.util.Arrays;

public class SetPositiveNegtiveSequency18 {
	public static void main(String[] args) {
		int[] array = { 10, 30, -1, 40, -2, -3, 50, -9 };
//		int pos = 0, neg = 1;
//		int[] result = new int[array.length];
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] > 0 && pos < result.length) {
//				result[pos] = array[i];
//				pos = pos + 2;
//			} else if (array[i] < 0 && neg < result.length) {
//				result[neg] = array[i];
//				neg=neg+2;
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

		int pos = 1;
		int neg = j;

		while (pos < array.length && neg < array.length) {
			int temp = array[pos];
			array[pos] = array[neg];
			array[neg] = temp;
			pos=pos+2;
			neg++;
		}
		System.out.println(Arrays.toString(array));
	}
}
