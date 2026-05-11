package com.example.InterviewCoding19;

import java.util.Arrays;

public class RotateArrayFromRightFromKthDSA19 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int kth = 3;
		int n = array.length - 1;
		kth = kth % n;

		doRotate(array, 0, n);
		doRotate(array, 0, kth-1);
		doRotate(array, kth, n);
		
		System.out.println(Arrays.toString(array));
	}

	private static void doRotate(int[] array, int i, int j) {
        while(i<j) {
        	int temp = array[i];
        	array[i]=array[j];
        	array[j]=temp;
        	i++;j--;
        }
	}
}
