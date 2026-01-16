package com.example.InterviewCoding11;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromArray11 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 3, 6, 3, 7, 4, 8, 6, 9, 2, 10, 4 };
		List<Integer> sortedFilterArray = getFilterSortedArray(array);
		System.out.println(sortedFilterArray);
	}

	public static List<Integer> getFilterSortedArray(int[] array) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					array[i] = array[i] + array[j];
					array[j] = array[i] - array[j];
					array[i] = array[i] - array[j];
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && i!=j) {
					flag = true;
					break;
				}
			}
			if (!list.contains(array[i]) && !flag) {
				list.add(array[i]);
			}
		}
		return list;
	}
}
