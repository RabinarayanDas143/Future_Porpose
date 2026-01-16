package com.example.InterviewCoding12;

public class FindKthLargestNumberFromArray12 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 3, 6, 9, 8, 7, 10 };
		int Kth = 3;
		int result = getKthLargestNumber(array, Kth);
		System.out.println(result);
	}

	public static int getKthLargestNumber(int[] array, int kth) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
			if (i == kth - 1) {
				result = array[i];
				break;
			}
		}
		return result;
	}
}
