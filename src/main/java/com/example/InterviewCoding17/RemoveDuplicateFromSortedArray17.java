package com.example.InterviewCoding17;

public class RemoveDuplicateFromSortedArray17 {
	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 8, 9, 10, 10 };
		int j = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] != array[j]) {
				j++;
				array[j] = array[i];
			}
		}
		System.out.println(j);
		int length = j + 1;
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + ",");
		}
	}
}
