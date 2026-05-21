package com.example.InterviewCoding22;

import java.util.Arrays;

public class AnnagramProgram22 {
	public static void main(String[] args) {
		String str1 = "RaceCar";
		String str2 = "CarRace";

		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();

		doSort(array1);
		doSort(array2);

		if (Arrays.equals(array1, array2)) {
			System.out.println("Both string are Annagram");
		} else {
			System.out.println("They are not Annagram...");
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
