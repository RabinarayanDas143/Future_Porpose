package com.example.InterviewCoding21;

import java.util.Arrays;

public class FindMultipleMissingNumber21 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 10 };
		int n = Arrays.stream(array).max().getAsInt();
		boolean[] result = new boolean[n + 1];
		for (int i : array) {
			result[i] = true;
		}

		for (int i = 1; i < result.length; i++) {
			if (!result[i])
				System.out.print(i + ",");
		}
	}
}
