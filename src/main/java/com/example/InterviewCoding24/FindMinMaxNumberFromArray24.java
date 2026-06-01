package com.example.InterviewCoding24;

public class FindMinMaxNumberFromArray24 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int min = array[0];
		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
			else if (array[i] > max)
				max = array[i];
		}
		System.out.println("min :"+min);
		System.out.println("max :"+max);
	}
}
