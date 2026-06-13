package com.example.InterviewCoding27;

public class RemoveDuplicateFromSortedArray27 {
	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 8, 9, 10, 10 };
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != array[j]) {
				j++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		for (int i = 0; i <= j; i++) {
			System.out.print(array[i] + ",");
		}
	}
}
