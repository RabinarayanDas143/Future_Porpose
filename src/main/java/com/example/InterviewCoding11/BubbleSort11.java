package com.example.InterviewCoding11;

import java.util.Arrays;

public class BubbleSort11 {

	private static BubbleSort11 obj = null;

	private BubbleSort11() {
		if (obj != null) {
			throw new RuntimeException("Violence the Singleton Rule");
		}
	}

	public static BubbleSort11 getInstance() {
		if (obj == null) {
			synchronized (BubbleSort11.class) {
				if (obj == null) {
					obj = new BubbleSort11();
				}
			}
		}
		return obj;
	}

	public static void main(String[] args) {
		BubbleSort11 obj = getInstance();
		int[] array = { 5, 4, 3, 2, 1, 9, 8, 7, 6, 10 };
		int[] arraySortinForLoop = obj.getArraySortInForLoop(array);
		System.out.println("Array sort through for loop :" + Arrays.toString(arraySortinForLoop));

		int[] arraySortinDoWhileLoop = obj.getArraySortInDoWhileLoop(array);
		System.out.println("Array sort through do while loop :" + Arrays.toString(arraySortinDoWhileLoop));
	}

	private int[] getArraySortInDoWhileLoop(int[] array) {
		boolean swap;
		do {
			swap = false;
			for (int i = 0; i < array.length; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] > array[j]) {
						array[i] = array[i] + array[j];
						array[j] = array[i] - array[j];
						array[i] = array[i] - array[j];
						swap = true;
					}
				}
			}
		} while (swap);
		return array;
	}

	private int[] getArraySortInForLoop(int[] array) {
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
