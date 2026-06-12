package com.example.InterviewCoding25;

public class AverageOfAllPositiveNumbers25 {
	public static void main(String[] args) {
		int[] array = { 1, 2, -5, 3, -6, 5, 9, -9 };
		int count = 0, sum = 0;
		for (int i : array) {
			if (i > 0) {
				sum = sum + i;
				count++;
			}
		}
		System.out.println("Average is :"+sum/count);
	}
}
