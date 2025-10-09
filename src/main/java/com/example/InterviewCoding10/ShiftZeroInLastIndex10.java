package com.example.InterviewCoding10;

import java.util.Arrays;

public class ShiftZeroInLastIndex10 {
	public static void main(String[] args) {
		int[] array = { 1, 0, 2, 0, 3, 4, 0, 5 };
		int[] result = shiftZeroInLastIndex(array);
		System.out.println(Arrays.toString(result));
	}

	private static int[] shiftZeroInLastIndex(int[] array) {
		int j = 0;
		for (int i = 0; i <= array.length-1; i++) {
			if (array[i] != 0) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				j++;
			}
		}
		return array;
	}
}
