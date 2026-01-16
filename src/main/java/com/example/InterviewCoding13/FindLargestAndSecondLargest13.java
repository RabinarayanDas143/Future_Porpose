package com.example.InterviewCoding13;

public class FindLargestAndSecondLargest13 {
	public static void main(String[] args) {
		int[] array = { 1, 4, 7, 9, 15 };
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
		System.out.println("Largest num is :" + largest);
		System.out.println("Second Largest num is :" + secondLargest);
	}
}
