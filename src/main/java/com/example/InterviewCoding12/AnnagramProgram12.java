package com.example.InterviewCoding12;

import java.util.Arrays;

public class AnnagramProgram12 {
	public static void main(String[] args) {
		String str1 = "Racecar";
		String str2 = "carrace";
		String result = checkAnnagram(str1, str2);
		System.out.println(result);
	}

	public static String checkAnnagram(String str1, String str2) {
		char[] charArray1 = str1.toLowerCase().toCharArray();
		char[] charArray2 = str2.toLowerCase().toCharArray();
		charArraySort(charArray1);
		charArraySort(charArray2);
		if (Arrays.equals(charArray1, charArray2)) {
			return "Both Stirngs are Annagram.";
		} else {
			return "Both Stirngs are not Annagram.";
		}
	}

	public static char[] charArraySort(char[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					char temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}
