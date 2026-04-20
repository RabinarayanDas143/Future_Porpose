package com.example.InterviewCoding19;

import java.util.Arrays;

public class Find3ElementSumis0DSA19 {
	public static void main(String[] args) {
		int[] array = { -4, 1, -1, 5, -3, -1, 2, 3 };
		boolean flag;
		do {
			flag = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					flag = true;
				}
			}
		} while (flag);
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length - 2; i++) {
			if (i > 0 && array[i] == array[i - 1])
				continue;

			int left = i + 1;
			int right = array.length - 1;
			while (left < right) {
				int sum = array[i] + array[left] + array[right];
				if (sum == 0) {
					System.out.println(array[i] + "," + array[left] + "," + array[right]);
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
}
