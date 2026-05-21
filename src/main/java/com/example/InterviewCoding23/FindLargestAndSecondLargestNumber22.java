package com.example.InterviewCoding23;

public class FindLargestAndSecondLargestNumber22 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int largest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;
		for (int i : array) {
			if (i > largest) {
				secLargest = largest;
				largest = i;
			} else if (i > secLargest && i != largest) {
				secLargest = i;
			}
		}
		System.out.println("Largest num is : "+largest);
		System.out.println("Second Largest num is : "+secLargest);
	}
}
