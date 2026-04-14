package com.example.InterviewCoding18;

public class FindMultipleMissingNumber18 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 7, 9, 9, 10 };
		int last = array[array.length - 1];
		boolean[] res = new boolean[last + 1];
		for (int i : array) {
			res[i] = true;
		}
		for (int i = 1; i < res.length; i++) {
			if (!res[i])
				System.out.print(i+" ,");
		}
	}
}
