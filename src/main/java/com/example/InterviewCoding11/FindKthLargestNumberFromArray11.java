package com.example.InterviewCoding11;

public class FindKthLargestNumberFromArray11 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 3, 6, 9, 8, 7, 10 };
		int Kth = 3;
		int result = getKthLargestNumber(array, Kth);
		if (result > 0) {
			System.out.println(result);
		} else {
			System.out.println("Given number is not found in array!!");
		}
	}

	public static int getKthLargestNumber(int[] array, int kth) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
			if (i == kth - 1) {
				return array[i];
			}
		}
		return -1;
	}
}
