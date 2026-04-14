package com.example.InterviewCoding18;

import java.util.Arrays;

public class AnnagramProgram18 {
	public static void main(String[] args) {
		String str1 = "Racecar";
		String str2 = "carrace";

		char[] charArray1 = str1.toLowerCase().toCharArray();
		char[] charArray2 = str2.toLowerCase().toCharArray();
		doSort(charArray1);
		doSort(charArray2);
		
		if(Arrays.equals(charArray1, charArray2)) {
			System.out.println("Given Strings are Annagram..");
		}else {
			System.out.println("Given Strings are not Annagram..");
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
