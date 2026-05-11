package com.example.InterviewCoding19;

public class FindMinMaxNumberFromArray19 {
	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 1, 9, 8, 7, 6, 10 };
		int min = array[0];
		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
			else if (array[i] < min)
				min = array[i];
		}
		System.out.println("min :" + min);
		System.out.println("max :" + max);
	}
}
