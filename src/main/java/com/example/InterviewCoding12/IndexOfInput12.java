package com.example.InterviewCoding12;

public class IndexOfInput12 {
	public static void main(String[] args) {
		int num = 11;
		int index = -1;
		int[] array = { 1, 44, 2, 3, 66, 88, 11, 66, 33, 55 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				index = i;
			}
		}
		if (index > 0)
			System.out.println("Index is :" + index);
		else
			System.out.println("Given number is not present in Array.");
	}
}
