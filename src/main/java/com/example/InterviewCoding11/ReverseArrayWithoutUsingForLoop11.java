package com.example.InterviewCoding11;

import java.util.Arrays;

public class ReverseArrayWithoutUsingForLoop11 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int first = 0;
		int last = array.length - 1;
		while (first < last) {
			int temp = array[last];
			array[last] = array[first];
			array[first] = temp;
			first++;
			last--;
		}
		System.out.println(Arrays.toString(array));
	}
}
