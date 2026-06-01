package com.example.InterviewCoding24;

public class FindLargestAndSecondLargestNumber24 {
	public static void main(String[] args) {
		int[] array = { 22, 55, 88, 55, 99, 111 };
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
		System.out.println("largest :"+largest);
		System.out.println("secondLargest :"+secondLargest);
	}
}
