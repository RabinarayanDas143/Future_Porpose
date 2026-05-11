package com.example.InterviewCoding19;

import java.util.Arrays;

public class ReverseArrayWithoutUsingForLoop19 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int left = 0, right = array.length - 1;
		while (left < right) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(array));
	}
}
