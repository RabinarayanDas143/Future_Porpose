package com.example.InterviewCoding22;

import java.util.Arrays;

public class FindMultipleMissingNumber22 {
	public static void main(String[] args) {
		int[] array = { 3, 7, 9, 15 };
		int min = Arrays.stream(array).min().getAsInt();
		int max = Arrays.stream(array).max().getAsInt();
		boolean[] result = new boolean[max + 1];
		for (int i : array) {
			result[i] = true;
		}

		for (int i = min; i < result.length; i++) {
			if (!result[i])
				System.out.print(i + ",");
		}
	}
}
