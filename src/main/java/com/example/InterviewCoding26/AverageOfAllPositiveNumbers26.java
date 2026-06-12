package com.example.InterviewCoding26;

public class AverageOfAllPositiveNumbers26 {
	public static void main(String[] args) {
		int[] array = { 1, 2, -5, 3, -6, 5, 9, -9 };
		int count = 0, sum = 0;
		for (int i : array) {
			if (i > 0) {
				count++;
				sum += i;
			}
		}
		double average= sum/count;
		System.out.println(average);
	}
}
