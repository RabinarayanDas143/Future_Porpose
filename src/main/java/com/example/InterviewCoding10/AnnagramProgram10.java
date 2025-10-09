package com.example.InterviewCoding10;

import java.util.Arrays;

public class AnnagramProgram10 {
	public static void main(String[] args) {
		String str1 = "Racecar";
		String str2 = "Carrace";

		String result = checkAnnagram(str1, str2);
		System.out.println(result);
	}

	private static String checkAnnagram(String str1, String str2) {
		char[] char1 = str1.toLowerCase().toCharArray();
		char[] char2 = str2.toLowerCase().toCharArray();
		charArraySort(char1);
		charArraySort(char2);
		if(Arrays.equals(char1, char2)) {
			return "Given Strings are Annagram";
		}else
		return "Given Strings are not Annagram";
	}

	private static void charArraySort(char[] char1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < char1.length; i++) {
			for (int j = i + 1; j < char1.length; j++) {
				if (char1[i] > char1[j]) {
					char temp = char1[i];
					char1[i] = char1[j];
					char1[j] = temp;
				}
			}
		}
	}
}
