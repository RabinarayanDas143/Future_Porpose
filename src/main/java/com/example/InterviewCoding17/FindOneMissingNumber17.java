package com.example.InterviewCoding17;

public class FindOneMissingNumber17 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int last = array[array.length - 1];
		int actrualSum = last * (last + 1) / 2;
		int givenSum = 0;
		for (int i : array) {
			givenSum = givenSum + i;
		}
		int missingNum = actrualSum - givenSum;
		System.out.println(missingNum);
	}
}
