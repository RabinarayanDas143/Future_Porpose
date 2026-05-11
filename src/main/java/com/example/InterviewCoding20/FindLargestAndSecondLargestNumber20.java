package com.example.InterviewCoding20;

public class FindLargestAndSecondLargestNumber20 {
	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 1, 10, 9, 8, 7, 6 };
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i : array) {
			if (i > largest) {
				secondLargest = largest;
				largest = i;
			} else if (i != largest && i > secondLargest) {
				secondLargest = i;
			}
		}
		System.out.println("largest :" + largest);
		System.out.println("secondLargest :" + secondLargest);
	}
}
