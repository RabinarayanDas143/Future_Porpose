package com.example.InterviewCoding15;

import java.util.Arrays;

public class SetPositiveNegtiveSequency15 {
	public static void main(String[] args) {
		int[] array = { 10, 30, -1, 40, -2, -3, 50, -9 };
		int[] result = new int[array.length];
		int pos = 0, neg = 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0 && pos < result.length) {
				result[pos] = array[i];
				pos = pos + 2;
			} else if (array[i] < 0 && neg < result.length) {
				result[neg] = array[i];
				neg = neg + 2;
			}
		}

		System.out.println(Arrays.toString(result));

		int[] arr = { 10, 30, -1, 40, -2, -3, 50, -9 };
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}

		System.out.println("=== :" + Arrays.toString(arr));

		int posi = 1;
		int negi = j;
		while (posi < arr.length && negi < arr.length) {
			int temp = arr[posi];
			arr[posi] = arr[negi];
			arr[negi] = temp;

			posi += 2;
			negi++;
		}

		System.out.println(Arrays.toString(arr));
	}
}
