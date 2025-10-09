package com.example.InterviewCoding10;

public class FindKthLargestNumberFromArray10 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 3, 6, 9, 8, 7, 10 };
		int Kth = 3;
		int KthLargest = getKthLargestNumber(array, Kth);
		System.out.println("KthLargest is :" + KthLargest);
	}

	private static int getKthLargestNumber(int[] array, int Kth) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
			if (i == Kth - 1) {
				return array[i];
			}
		}
		return -1;
	}
}
