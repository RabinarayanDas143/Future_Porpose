package com.example.InterviewCoding13;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateAndFilterFromArray13 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// Fine Duplicate
		List<Integer> duplicate = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					flag = true;
				}
			}

			if (!duplicate.contains(array[i]) && flag) {
				duplicate.add(array[i]);
			}
		}
		System.out.println("Duplicate is : " + duplicate);

		// Filter number
		List<Integer> filter = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					flag = true;
				}
			}

			if (!flag && !filter.contains(array[i])) {
				filter.add(array[i]);
			}
		}

		System.out.println("Filter :" + filter);
	}
}
