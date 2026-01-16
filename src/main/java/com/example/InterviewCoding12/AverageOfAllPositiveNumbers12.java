package com.example.InterviewCoding12;

public class AverageOfAllPositiveNumbers12 {
	public static void main(String[] args) {
		int[] array = { 12, -45, -8, 2, -5, 19 };
		double average = getAverage(array);
		System.out.println(average);
	}

	public static double getAverage(int[] array) {
		double average = 0;
		int count = 0, sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				sum = sum + array[i];
				count++;
			}
			if (count != 0) {
				average = sum / count;
			}
		}
		return average;
	}
}
