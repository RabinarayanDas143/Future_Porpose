package com.example.InterviewCoding19;

public class AverageOfAllPositiveNumbers19 {
	public static void main(String[] args) {
		int[] array = { 1, -2, 3, -4, 5, -6, 7, -8, 9, -10 };
		int count = 0, sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				count++;
				sum = sum + array[i];
			}
		}
		double average = sum/count;
		System.out.println(average);
	}
}
