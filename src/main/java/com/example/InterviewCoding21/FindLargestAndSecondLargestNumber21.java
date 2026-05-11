package com.example.InterviewCoding21;

public class FindLargestAndSecondLargestNumber21 {
	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 1, 10, 9, 8, 7, 6 };
		int largest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest)
				largest = array[i];
			else if (array[i] > secLargest && array[i] != largest) {
				secLargest = array[i];
			}
		}
		System.out.println("largest :" + largest);
		System.out.println("secLargest :" + secLargest);
	}
}
