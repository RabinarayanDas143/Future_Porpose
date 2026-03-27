package com.example.InterviewCoding16;

public class FindMinMaxNumberFromArray16 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 3, 6, 9, 7, 8, 10 };
		int min = array[0];
		int max = array[0];
		for (int i : array) {
			if (i < min) {
				min = i;
			} else if (i > max) {
				max = i;
			}
		}
		System.out.println("max no is :"+max);
		System.out.println("mix no is :"+min);
	}
}
