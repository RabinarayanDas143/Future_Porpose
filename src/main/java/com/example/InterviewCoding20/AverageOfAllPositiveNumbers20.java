package com.example.InterviewCoding20;

public class AverageOfAllPositiveNumbers20 {
	public static void main(String[] args) {
		int[] array = { 1, 2, -5, 3, -6, 5, 9, -9 };
		int sum = 0, count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				sum = sum + array[i];
				count++;
			}
		}
		double average = sum/count;
		System.out.println(average);
	}
}
