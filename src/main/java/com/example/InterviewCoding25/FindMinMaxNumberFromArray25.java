package com.example.InterviewCoding25;

public class FindMinMaxNumberFromArray25 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int min = array[0];
		int max = array[0];

		for (int i : array) {
			if (i < min)
				min = i;
			else if (i > max)
				max = i;
		}
		System.out.println("min :" + min);
		System.out.println("Max :" + max);
	}
}
