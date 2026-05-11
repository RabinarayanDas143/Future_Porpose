package com.example.InterviewCoding21;

public class FindMinMaxNumberFromArray21 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int min = array[0];
		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (min > array[i])
				min = array[i];
			else if (max < array[i])
				max = array[i];
		}
		System.out.println("max num is :" + max);
		System.out.println("Min num is :" + min);
	}
}
