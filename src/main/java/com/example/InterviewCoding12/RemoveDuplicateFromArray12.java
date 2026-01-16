package com.example.InterviewCoding12;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromArray12 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 3, 6, 3, 7, 4, 8, 6, 9, 2, 10, 4 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					flag = true;
				}
			}
			if (!flag && !list.contains(array[i])) {
				list.add(array[i]);
			}
		}
		System.out.println(list);
	}
}
