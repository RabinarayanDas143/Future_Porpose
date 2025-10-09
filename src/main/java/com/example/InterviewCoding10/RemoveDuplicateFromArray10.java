package com.example.InterviewCoding10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromArray10 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 3, 6, 3, 7, 4, 8, 6, 9, 2, 10, 4 };
		List<Integer> sortedFilterArray = getFilterSortedArray(array);
		System.out.println(sortedFilterArray);
	}

	public static List<Integer> getFilterSortedArray(int[] array) {
		List<Integer> list = new ArrayList<>();

		// Sort
		boolean flag = false;
		do {
			flag = false;
			for (int i = 0; i < array.length; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] > array[j]) {
						array[i] = array[i] + array[j];
						array[j] = array[i] - array[j];
						array[i] = array[i] - array[j];
					}
				}
			}
		} while (flag);

		System.out.println(Arrays.toString(array));
		// Filter
		for (int i = 0; i < array.length; i++) {
			boolean flagg = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]&&i!=j) {
					flagg = true;
					break;
				}
			}
			if (!flagg && !list.contains(array[i])) {
				list.add(array[i]);
			}
		}
		return list;
	}
}
