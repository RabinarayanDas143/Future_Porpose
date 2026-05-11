package com.example.InterviewCoding20;

import java.util.Arrays;

public class FindMultipleMissingNumber20 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 5, 9, 10 };
		int last = Arrays.stream(array).max().getAsInt();
		boolean[] boolArray = new boolean[last+1];
		for (int i : array) {
			boolArray[i] = true;
		}
		for (int i = 1; i < boolArray.length; i++) {
			if (!boolArray[i])
				System.out.print(i + ",");
		}
	}
}
