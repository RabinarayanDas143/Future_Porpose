package com.example.InterviewCoding12;

import java.util.Arrays;

public class ReverseArrayWithoutUsingForLoop12 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int first = 0;
		int last = array.length - 1;
		while (first < last) {
			int temp = array[first];
			array[first] = array[last];
			array[last] = temp;
			first++;
			last--;
		}
		System.out.println(Arrays.toString(array));
	}
}
