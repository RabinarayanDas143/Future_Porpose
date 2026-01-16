package com.example.InterviewCoding13;

import java.util.Arrays;

public class AnnagramProgram13 {
	public static void main(String[] args) {
		String str1 = "Racecar";
		String str2 = "carrace";

		char[] array1 = str1.toLowerCase().toCharArray();
		char[] array2 = str2.toLowerCase().toCharArray();

		sortArray(array1);
		sortArray(array2);
		
		if(Arrays.equals(array1, array2)) {
			System.out.println("Given Strings are Annagram..");
		}else {
			System.out.println("Given Strings are not Annagram..");
		}
	}

	public static void sortArray(char[] array) {
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
