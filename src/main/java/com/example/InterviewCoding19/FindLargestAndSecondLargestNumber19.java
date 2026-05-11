package com.example.InterviewCoding19;

public class FindLargestAndSecondLargestNumber19 {
	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 1, 10, 9, 8, 7, 6 };
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
			} else if (array[i] > secondLargest && array[i] != largest) {
				secondLargest = array[i];
			}
		}
		System.out.println("largest num is :" + largest);
		System.out.println("secondLargest num is :" + secondLargest);
	}
}
