package com.example.InterviewCoding14;

public class RemoveDuplicateFromSortedArray14 {
	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 8, 9, 10, 10 };
		int length = getUniqueArray(array);
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

	private static int getUniqueArray(int[] array) {
		int i = 0;
		for (int j = 1; j < array.length; j++) {
			if (array[i] != array[j]) {
				i++;
				array[i] = array[j];
			}
		}
		return i + 1;
	}
}
