package com.example.InterviewCoding17;

import java.util.Arrays;

public class AnnagramProgram17 {
	public static void main(String[] args) {
		String str1 = "Racecar";
		String str2 = "carrace";

		char[] str1CharArray = str1.toLowerCase().toCharArray();
		char[] str2CharArray = str2.toLowerCase().toCharArray();

		doSort(str1CharArray);
		doSort(str2CharArray);

		if (Arrays.equals(str1CharArray, str2CharArray))
			System.out.println("Given Strings are Annagram..");
		else
			System.out.println("Given Strings are not Annagram..");
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
