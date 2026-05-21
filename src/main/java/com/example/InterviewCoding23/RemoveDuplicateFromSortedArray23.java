package com.example.InterviewCoding23;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray23 {
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
		System.out.println(Arrays.toString(array));
		for(int i=0;i<j+1;i++) {
			System.out.print(array[i]+",");
		}
	}
}
