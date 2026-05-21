package com.example.InterviewCoding23;

public class FindMinMaxNumberFromArray23 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int minValue = array[0];
		int maxValue = array[0];

		for (int i : array) {
			if (minValue > i) {
				minValue = i;
			} else if (maxValue < i) {
				maxValue = i;
			}
		}
		System.out.println("maxValue :" + maxValue);
		System.out.println("minValue :" + minValue);
	}
}
