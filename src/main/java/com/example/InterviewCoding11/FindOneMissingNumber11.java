package com.example.InterviewCoding11;

public class FindOneMissingNumber11 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int missing = getMissingNumber(array);
		System.out.println(missing);
	}

	public static int getMissingNumber(int[] array) {
		int last = array.length + 1;
		int originalSum = 0, input = 0;
		for (int i = 0; i <= last; i++) {
			originalSum = originalSum + i;
		}
		for (int i = 0; i < array.length; i++) {
			input = input + array[i];
		}
		return originalSum - input;
	}
}
