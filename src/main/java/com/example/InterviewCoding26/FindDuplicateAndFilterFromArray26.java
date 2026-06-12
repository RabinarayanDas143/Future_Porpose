package com.example.InterviewCoding26;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateAndFilterFromArray26 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 4, 5, 6, 7, 8 };
		List<Integer> filter = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] != array[j]) {
					flag = true;
				}
			}
			if (flag && !filter.contains(array[i]))
				filter.add(array[i]);
		}
		System.out.println(filter);

		List<Integer> duplicate = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					flag = true;
				}
			}
			if (flag && !duplicate.contains(array[i])) {
				duplicate.add(array[i]);
			}
		}
		System.out.println(duplicate);
	}
}
