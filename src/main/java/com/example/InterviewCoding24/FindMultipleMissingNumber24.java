package com.example.InterviewCoding24;

import java.util.Arrays;

public class FindMultipleMissingNumber24 {
	public static void main(String[] args) {
		int[] array = { 12, 15, 20 };
		
		int min = Arrays.stream(array).min().getAsInt();
		int max = Arrays.stream(array).max().getAsInt();
		
		boolean[] result = new boolean[max-min+1];
		for(int i : array) {
			result[i-min]=true;
		}
		System.out.println(Arrays.toString(result));
		for(int i=min;i<=max;i++) {
			if(!result[i-min]) {
				System.out.print(i+",");
			}
		}
	}
}
