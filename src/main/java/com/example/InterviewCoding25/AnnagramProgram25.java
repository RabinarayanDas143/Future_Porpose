package com.example.InterviewCoding25;

import java.util.Arrays;

public class AnnagramProgram25 {
	public static void main(String[] args) {
		String str1 = "RaceCar";
		String str2 = "carRace";

		char[] array1 = str1.toLowerCase().toCharArray();
		char[] array2 = str2.toLowerCase().toCharArray();

		doSort(array1);
		doSort(array2);
		
		if (Arrays.equals(array1, array2)) {
			System.out.println("Given Strings are Annagram");
		} else {
			System.out.println("Noo");
		}
	}

	private static void doSort(char[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					char temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}
