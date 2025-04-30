package com.example.InterviewCoding10;

import java.util.Arrays;

public class AnnagramProgram10 {
	public static void main(String[] args) {
		String str1 = "RaceCar";
		String str2 = "CarRace";

		char[] char1 = str1.toLowerCase().toCharArray();
		char[] char2 = str2.toLowerCase().toCharArray();

		for (int i = 0; i < char1.length; i++) {
			for (int j = i + 1; j < char1.length; j++) {
				if (char1[i] > char1[j]) {
					char temp = char1[i];
					char1[i] = char1[j];
					char1[j] = temp;
				}
			}
		}

		for (int i = 0; i < char2.length; i++) {
			for (int j = i + 1; j < char2.length; j++) {
				if (char2[i] > char2[j]) {
					char temp = char2[i];
					char2[i] = char2[j];
					char2[j] = temp;
				}
			}
		}

		if (Arrays.equals(char1, char2))
			System.out.println("Two Strings are Annagram");
		else
			System.out.println("Error : Two Strings are not annagram");
	}
}
