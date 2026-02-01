package com.example.InterviewCoding14;

import java.util.Arrays;

public class ShiftZeroInLastIndex14 {
	public static void main(String[] args) {
		int[] array = { 1, 0, 2, 0, 3, 4, 0, 5 };
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
