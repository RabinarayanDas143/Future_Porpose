package com.example.InterviewCoding14;

import java.util.Arrays;

public class SetPositiveNegtiveSequency14 {
	public static void main(String[] args) {
		int[] array = { 10, 30, -1, 40, -2, -3, 50,-9 };
		
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
				j++;
			}
		}

		System.out.println(Arrays.toString(array));
		int pos = 1;
		int neg = j;
		while (pos < array.length && neg < array.length) {
			int temp = array[pos];
			array[pos] = array[neg];
			array[neg] = temp;

			pos += 2;
			neg++;
		}

		System.out.println(Arrays.toString(array));
		
		int[] array1 = { 10, 30, -1, 40, -2, -3, 50,-9 };
		int result[] = new int[array1.length];
		int posi=0,negi=1;
		for(int i=0;i<array1.length;i++) {
			if(array1[i]>0 && posi<result.length) {
				result[posi]=array1[i];
				posi=posi+2;
			}else if(array1[i]<0 && negi<result.length) {
				result[negi]=array1[i];
				negi=negi+2;
			}
		}
System.out.println("Array1 :"+Arrays.toString(result));
	}
}
