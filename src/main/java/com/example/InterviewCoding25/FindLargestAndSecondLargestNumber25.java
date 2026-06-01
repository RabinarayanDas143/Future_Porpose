package com.example.InterviewCoding25;

public class FindLargestAndSecondLargestNumber25 {
	public static void main(String[] args) {
		int[] array = { 22, 55, 88, 55, 99, 111 };
		int largest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;

		for (int i : array) {
			if (i > largest) {
				secLargest = largest;
				largest = i;
			} else if (i != largest && i > secLargest)
				secLargest = i;
		}
		System.out.println("largest :" + largest);
		System.out.println("secLargest :" + secLargest);
	}
}
