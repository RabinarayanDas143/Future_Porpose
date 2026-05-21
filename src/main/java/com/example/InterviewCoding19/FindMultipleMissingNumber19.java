package com.example.InterviewCoding19;

import java.util.Arrays;

public class FindMultipleMissingNumber19 {
public static void main(String[] args) {
	int[] array = { 2, 4, 7, 9, 9, 10 };
	int min = Arrays.stream(array).min().getAsInt();
	int last = Arrays.stream(array).max().getAsInt();
	boolean[] resultArray = new boolean[last+1];
	for(int i:array) {
		resultArray[i]=true;
	}
	for(int i=min;i<resultArray.length;i++) {
		if(!resultArray[i])
			System.out.print(i+",");
	}
}
}
