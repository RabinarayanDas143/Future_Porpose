package com.example.InterviewCoding20;

import java.util.Arrays;

public class AnnagramProgram20 {
	public static void main(String[] args) {
		String str1 = "RaceCar";
		String str2 = "CarRace";

		char[] strCharArray1 = str1.toLowerCase().toCharArray();
		char[] strCharArray2 = str2.toLowerCase().toCharArray();

		doSort(strCharArray1);
		doSort(strCharArray2);

		if (Arrays.equals(strCharArray1, strCharArray2))
			System.out.println("Both Strings are Annagram");
		else
			System.out.println("Both Stirngs are not Annagram");
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
