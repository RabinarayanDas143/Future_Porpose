package com.example.InterviewCoding22;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateAndFilterFromArray22 {
	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 3, 2, 1, 9, 6, 8, 7, 5, 3, 4, 2, 1, 10 };
		List<Integer> duplicate = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					flag = true;
				}
			}
			if (!duplicate.contains(array[i]) && flag) {
				duplicate.add(array[i]);
			}
		}
		System.out.println("Duplicate num is :" + duplicate);

		List<Integer> filterArray = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] != array[j])
					flag = false;
			}
			if (!filterArray.contains(array[i]) && !flag) {
				filterArray.add(array[i]);
			}
		}
		System.out.println("filterArray :" + filterArray);
	}
}
