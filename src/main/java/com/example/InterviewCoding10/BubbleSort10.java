package com.example.InterviewCoding10;

import java.util.Arrays;

public class BubbleSort10 {

	private static BubbleSort10 obj = null;

	private BubbleSort10() {
		if (obj != null) {
			throw new RuntimeException("Violence the Singleton Rule");
		}
	}

	public static BubbleSort10 getBubbleSort10Object() {
		if (obj == null) {
			synchronized (BubbleSort10.class) {
				if (obj == null) {
					obj = new BubbleSort10();
				}
			}
		}
		return obj;
	}

	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 1, 9, 8, 7, 6, 10 };
		BubbleSort10 obj = getBubbleSort10Object();
		int[] arraySortinForLoop = obj.getArraySortInForLoop(array);
		System.out.println("Array sort through for loop :" + Arrays.toString(arraySortinForLoop));

		int[] arraySortinDoWhileLoop = obj.getArraySortInDoWhileLoop(array);
		System.out.println("Array Sort through do while Loop :" + Arrays.toString(arraySortinDoWhileLoop));
	}

	private int[] getArraySortInDoWhileLoop(int[] array) {
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < array.length; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] > array[j]) {
						array[i] = array[i] + array[j];
						array[j] = array[i] - array[j];
						array[i] = array[i] - array[j];
						swapped = true;
					}
				}
			}
		} while (swapped);
		return array;
	}

	public int[] getArraySortInForLoop(int array[]) {

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
