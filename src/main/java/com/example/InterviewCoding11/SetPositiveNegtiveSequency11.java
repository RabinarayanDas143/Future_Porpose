package com.example.InterviewCoding11;

import java.util.Arrays;

public class SetPositiveNegtiveSequency11 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 5, -3, -1, -4 };
		int[] result = getPositiveNegetiveSequency(array);
		System.out.println(Arrays.toString(result));
	}

	private static int[] getPositiveNegetiveSequency(int[] array) {
		int positive = 0, negtive = 1;
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0 && positive < result.length) {
				result[positive] = array[i];
				positive = positive + 2;
			} else if (array[i] < 0 && negtive < result.length) {
				result[negtive] = array[i];
				negtive = negtive + 2;
			}
		}
		return result;
	}
}
