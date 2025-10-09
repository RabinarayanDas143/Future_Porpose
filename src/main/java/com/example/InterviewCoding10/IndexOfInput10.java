package com.example.InterviewCoding10;

public class IndexOfInput10 {
	public static void main(String[] args) {
		int num = 99;
		int[] array = { 1, 44, 2, 3, 66, 88, 11, 66, 33, 55 };
		int index = getIndexOfNum(array, num);
		if(index!=-1)
			System.out.println("Index is :"+index);
		else
			System.out.println("Given number is not present in array");
	}

	private static int getIndexOfNum(int[] array, int num) {
		int index = 0;
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				index = i;
				flag = true;
			}

		}
		if (flag) {
			return index;
		} else {
			return -1;
		}
	}
}
