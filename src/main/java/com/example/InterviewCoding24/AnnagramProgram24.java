package com.example.InterviewCoding24;

import java.util.Arrays;
import java.util.Set;

public class AnnagramProgram24 {
	public static void main(String[] args) {
		String str1 = "RaceCar";
		String str2 = "CarRace";

		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();

		doSort(array1);
		doSort(array2);
		
		if(Arrays.equals(array1, array2)) {
			System.out.println("Both strings are annagram");
		}else {
			System.out.println("Not Annagram.");
		}
		 
	}

	private static void doSort(char[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					char c = array[i];
					array[i] = array[j];
					array[j] = c;
				}
			}
		}
	}
}
