package com.example.InterviewCoding23;

import java.util.Arrays;

public class FindMultipleMissingNumber23 {
	public static void main(String[] args) {
		int[] array = { 5, 7, 9, 15 };
		int min = Arrays.stream(array).min().getAsInt();
		int max = Arrays.stream(array).max().getAsInt();
		boolean[] resArray = new boolean[max-min + 1];
		for (int i : array) {
			resArray[i-min] = true;
		}
		
		for(int i = min;i<=max;i++) {
			if(!resArray[i-min]) {
				System.out.print(i+",");
			}
		}
	}
}
