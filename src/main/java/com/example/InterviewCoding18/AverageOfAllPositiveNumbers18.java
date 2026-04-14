package com.example.InterviewCoding18;

public class AverageOfAllPositiveNumbers18 {
	public static void main(String[] args) {
		int[] array = { 12, -45, -8, 2, -5, 19 };
		int count = 0, sum = 0;
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
