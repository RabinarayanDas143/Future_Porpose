package com.example.InterviewCoding16;

public class AverageOfAllPositiveNumbers16 {
	public static void main(String[] args) {
		int[] array = { 12, -45, -8, 2, -5, 19 };
		int count = 0, sum = 0;
		double average = 0;
		for (int i : array) {
			if (i > 0) {
				count++;
				sum = sum + i;
			}
		}
		if (count != 0) {
			average = sum / count;
		}
		System.out.println(average);
	}
}
