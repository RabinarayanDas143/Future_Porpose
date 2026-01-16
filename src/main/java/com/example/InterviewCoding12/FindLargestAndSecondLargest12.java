package com.example.InterviewCoding12;

public class FindLargestAndSecondLargest12 {
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
		System.out.println("Largest :" + largest);
		System.out.println("Second Largest :" + secondLargest);
	}
}
