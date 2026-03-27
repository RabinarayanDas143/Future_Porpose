package com.example.InterviewCoding15;

public class AverageOfAllPositiveNumbers15 {
	public static void main(String[] args) {
		int[] array = { 12, -45, -8, 2, -5, 19 };
		int count = 0;
		int sum = 0;
		double average = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				sum = sum + array[i];
				count++;
			}
		}
		if (count != 0) {
			average = sum / count;
		}
		System.out.println("Average is :" + average);
	}
}
