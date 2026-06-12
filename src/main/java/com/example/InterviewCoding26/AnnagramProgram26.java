package com.example.InterviewCoding26;

import java.util.Arrays;

public class AnnagramProgram26 {
	public static void main(String[] args) {
		String str1 = "RaceCar";
		String str2 = "CarRace";

		char[] str1Array = str1.toLowerCase().toCharArray();
		char[] str2Array = str2.toLowerCase().toCharArray();

		doSort(str1Array);
		doSort(str2Array);
		
		if(Arrays.equals(str1Array, str2Array)) {
			System.out.println("Annagramm");
		}else {
			System.out.println("Nott");
		}
	}

	private static void doSort(char[] str1Array) {
		for (int i = 0; i < str1Array.length; i++) {
			for (int j = i + 1; j < str1Array.length; j++) {
				if (str1Array[i] > str1Array[j]) {
					char c = str1Array[i];
					str1Array[i] = str1Array[j];
					str1Array[j] = c;
				}
			}
		}
	}
}
