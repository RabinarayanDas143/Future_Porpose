package com.example.InterviewCoding18;

public class FindMinMaxNumberFromArray18 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 3, 6, 9, 7, 8, 10 };
		int min = array[0];
		int max = array[0];
		for (int i : array) {
			if (min > i)
				min = i;
			else if (max < i)
				max = i;
		}
		System.out.println("Min no :" + min + ", Max no :" + max);
	}
}
