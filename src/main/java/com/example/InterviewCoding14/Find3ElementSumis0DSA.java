package com.example.InterviewCoding14;

import java.util.Arrays;

public class Find3ElementSumis0DSA {
	public static void main(String[] args) {
		int[] array = { -4, 1, -1, 5, -3, -1, 2, 3 };
		array = getSortArray(array);

		for (int i = 0; i < array.length - 2; i++) {
			// skip duplicate
			if (i > 0 && array[i] == array[i - 1]) {
				continue;
			}
			int left = i + 1;
			int right = array.length - 1;

			// two pointer approch
			while (left < right) {
				int sum = array[i] + array[left] + array[right];
				if (sum == 0) {
					System.out.println("Three number is :" + array[i] + ", " + array[left] + ", " + array[right]);
					left++;
					right--;
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}

			}
		}
	}

	private static int[] getSortArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}
		return array;
	}
}
