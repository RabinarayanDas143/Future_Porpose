package com.example.InterviewCoding13;

import java.util.Arrays;

public class BubbleSort13 {
	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 1, 9, 8, 7, 6, 10 };
		int[] array1 = { 5, 4, 3, 2, 1, 9, 8, 7, 6, 10 };

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}
		System.out.println(Arrays.toString(array));

		boolean swap;
		do {
			swap = false;
			for (int i = 0; i < array1.length; i++) {
				for (int j = i + 1; j < array1.length; j++) {
                     if(array1[i]>array1[j]) {
                    	 array1[i]=array1[i]+array1[j];
                         array1[j]=array1[i]-array1[j];
                         array1[i]=array1[i]-array1[j];
                         swap=true;
                     }
				}
			}
		} while (swap);
		System.out.println(Arrays.toString(array1));
	}
}
