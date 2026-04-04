package com.example.InterviewCoding17;

public class FindMinMaxNumberFromArray17 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 3, 6, 9, 7, 8, 10 };
		int min = array[0];
		int max = array[0];
		for (int i : array) {
			if (i > max)
				max = i;
			else if (i < min)
				min = i;
		}
		System.out.println("Max no is :" + max);
		System.out.println("Min no is :" + min);
	}
}
