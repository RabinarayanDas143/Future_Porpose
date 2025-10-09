package com.example.InterviewCoding10;


public class FindOneMissingNumber10 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int missing = getMissingFromArray(array);
		System.out.println("missing :" + missing);
	}

	private static int getMissingFromArray(int[] array) {
		int first = array[0];
		int last = array.length + 1;
		int original = 0, input = 0;
		for (int i = 0; i <= last; i++) {
			original = original + i;
		}
		for (int i = 0; i < array.length; i++) {
			input = input + array[i];
		}
		return original - input;
	}
}
