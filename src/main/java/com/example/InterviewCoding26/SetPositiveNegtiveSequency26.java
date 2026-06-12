package com.example.InterviewCoding26;

import java.util.Arrays;

public class SetPositiveNegtiveSequency26 {
	public static void main(String[] args) {
		int[] array = { 1, 2, -1, -2, -3, 3, 4, 5, -4, -5 };
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
			pos = pos + 2;
			neg++;
		}
		System.out.println(Arrays.toString(array));
	}
}
