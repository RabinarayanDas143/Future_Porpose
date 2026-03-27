package com.example.InterviewCoding15;

public class RemoveDuplicateFromSortedArray15 {
	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 8, 9, 10, 10 };
		int i = 0;
		for (int j = 1; j < array.length; j++) {
			if (array[i] != array[j]) {
				i++;
				array[i] = array[j];
			}
		}

		int length = i + 1;
		for (int k = 0; k < length; k++) {
			System.out.print(array[k] + " ,");
		}
	}
}
