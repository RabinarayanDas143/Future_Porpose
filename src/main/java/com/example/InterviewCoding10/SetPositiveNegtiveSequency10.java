package com.example.InterviewCoding10;

import java.util.Arrays;

public class SetPositiveNegtiveSequency10 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 5, -3, -1, -4 };
		int[] result = getPositiveNegetiveSequency(array);
		System.out.println(Arrays.toString(result));
	}

	public static int[] getPositiveNegetiveSequency(int[] array) {
		int positive = 0, negetive = 1;
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0 && positive < result.length) {
				result[positive] = array[i];
				positive += 2;
			} else if (array[i] < 0 && negetive < result.length) {
				result[negetive] = array[i];
				negetive += 2;
			}
		}
		return result;
	}
}
