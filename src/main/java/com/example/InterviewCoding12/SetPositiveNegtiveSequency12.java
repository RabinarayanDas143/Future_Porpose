package com.example.InterviewCoding12;

import java.util.Arrays;

public class SetPositiveNegtiveSequency12 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 5, -3, -1, -4 };
		int positive = 0, negetive = 1;
		int result[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0 && positive < result.length) {
				result[positive] = array[i];
				positive = positive + 2;
			} else if (array[i] < 0 && negetive < result.length) {
				result[negetive] = array[i];
				negetive = negetive + 2;
			}
		}
		System.out.println(Arrays.toString(result));
	}
}
