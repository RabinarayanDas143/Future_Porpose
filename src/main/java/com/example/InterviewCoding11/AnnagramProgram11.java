package com.example.InterviewCoding11;

import java.util.Arrays;

public class AnnagramProgram11 {
	public static void main(String[] args) {
		String str1 = "Racecar";
		String str2 = "Carrace";

		String result = checkAnngram(str1, str2);
		System.out.println(result);
	}

	private static String checkAnngram(String str1, String str2) {
		char[] charArray = str1.toLowerCase().toCharArray();
		char[] charArray1 = str2.toLowerCase().toCharArray();
		charArraySort(charArray);
		charArraySort(charArray1);
		if (Arrays.equals(charArray, charArray1)) {
			return "Given Strings are Annagram..";
		} else {
			return "Given Strings are not Annagram;";
		}
	}

	private static void charArraySort(char[] charArray) {
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] > charArray[j]) {
					char temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
		}
	}
}
