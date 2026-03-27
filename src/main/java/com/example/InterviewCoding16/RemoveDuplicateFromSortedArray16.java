package com.example.InterviewCoding16;

public class RemoveDuplicateFromSortedArray16 {
	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 8, 9, 10, 10 };
		int i = 0;
		for (int j = 1; j < array.length; j++) {
			if (array[i] != array[j]) {
				i++;
				array[i] = array[j];
			}
		}
System.out.println(i);
		int lenght = i + 1;
		for (int k = 0; k < lenght; k++) {
			System.out.print(array[k]+" ,");
		}
	}
}
