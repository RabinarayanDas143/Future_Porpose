package com.example.InterviewCoding14;

import java.util.Arrays;

public class MergeTwoUnsortedArray14 {
	public static void main(String[] args) {
		int[] array1 = { 5, 1, 4, 2, 3 };
		int[] array2 = { 10, 8, 6, 9, 7 };
		int[] result = new int[array1.length + array2.length];
		int k = 0;
		for (int i : array1) {
			result[k++] = i;
		}
		for (int j : array2) {
			result[k++] = j;
		}
		
		for(int i=0;i<result.length;i++) {
			for(int j=i+1;j<result.length;j++) {
				if(result[i]>result[j]) {
					result[i]=result[i]+result[j];
					result[j]=result[i]-result[j];
					result[i]=result[i]-result[j];
				}
			}
		}
		System.out.println(Arrays.toString(result));
	}
}
