package com.example.InterviewCoding12;

import java.util.Arrays;

public class BubbleSort12 {
	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 1, 9, 8, 7, 6, 10 };
		int[] arraySortinForLoop = getArraySortInForLoop(array);
		System.out.println("Array sort through for loop :" + Arrays.toString(arraySortinForLoop));

		int[] arraySortinDoWhileLoop = getArraySortInDoWhileLoop(array);
		System.out.println("Array sort through do while loop :" + Arrays.toString(arraySortinDoWhileLoop));
	}

	public static int[] getArraySortInDoWhileLoop(int[] array) {
		boolean flag;
		do {
			flag = false;
			for (int i = 0; i < array.length; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] > array[j]) {
						array[i] = array[i] + array[j];
						array[j] = array[i] - array[j];
						array[i] = array[i] - array[j];
						flag = true;
					}
				}
			}
		} while (flag);
		return array;
	}

	public static int[] getArraySortInForLoop(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}
		return array;
	}
}
