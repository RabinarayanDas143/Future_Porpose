package com.example.InterviewCoding26;

public class Find3ElementSumis0DSA26 {
	public static void main(String[] args) {
		int[] array = { -4, 1, -1, 5, -3, -1, 2, 3 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int i = 0; i < array.length - 2; i++) {
			if (i > 0 && array[i] == array[i - 1])
				continue;

			int left = i;
			int right = array.length - 1;
			while (left < right) {
				int sum = array[i] + array[left] + array[right];
				if (sum == 0) {
					System.out.println("Three num is :" + array[i] + "," + array[left] + "," + array[right]);
					left++;
					right--;
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}
			}
		}
	}
}
