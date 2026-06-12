package com.example.InterviewCoding26;

import java.util.Arrays;

public class FindMultipleMissingNumber26 {
	public static void main(String[] args) {
		int[] array = { 12, 15, 20 };
		int min = Arrays.stream(array).min().getAsInt();
		int max = Arrays.stream(array).max().getAsInt();
		boolean[] result = new boolean[max - min + 1];
		for (int i : array) {
			result[i-min] = true;
		}

		for (int i = min; i <=max; i++) {
			if (!result[i - min])
				System.out.print(i + ",");
		}
	}
}
