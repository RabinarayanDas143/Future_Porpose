package com.example.InterviewCoding17;

import java.util.Arrays;

public class SetPositiveNegtiveSequency17 {
	public static void main(String[] args) {
		int[] array = { 10, 30, -1, 40, -2, -3, 50, -9 };
//		int[] result = new int[array.length];
//		int pos = 0, neg = 1;
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] > 0 && pos < result.length) {
//				array[pos] = array[i];
//				pos = pos + 2;
//			} else if (array[i] < 0 && neg < result.length) {
//				array[neg] = array[i];
//				neg =0; neg + 2;
//			}
//		}
//		System.out.println(Arrays.toString(array));

		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println(j);
		
		int pos = 1;
		int neg = j;
		
		while(pos<array.length && neg<array.length) {
			int temp = array[pos];
			array[pos]=array[neg];
			array[neg]=temp;
			pos=pos+2;
			neg++;
		}
		
		System.out.println(Arrays.toString(array));
	}
}
