package com.example.InterviewCoding15;

import java.util.Arrays;

public class AnnagramProgram15 {
	public static void main(String[] args) {
		String str1 = "Racecar";
		String str2 = "carrace";

		char[] charArray1 = str1.toLowerCase().toCharArray();
		char[] charArray2 = str2.toLowerCase().toCharArray();

		doSort(charArray1);
		doSort(charArray2);
		
		if(Arrays.equals(charArray1, charArray2)) {
			System.out.println("Both Strings are Annagrma..");
		}else {
			System.out.println("Both Strings are not Annagrma..");
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
