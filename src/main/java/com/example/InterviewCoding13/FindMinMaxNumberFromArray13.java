package com.example.InterviewCoding13;

public class FindMinMaxNumberFromArray13 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 3, 6, 9, 7, 8, 10 };
		int minValue = array[0];
		int maxValue = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			} else if (array[i] < minValue) {
				minValue = array[i];
			}
		}

		System.out.println("maxValue :" + maxValue);
		System.out.println("minValue :" + minValue);
	}
}
