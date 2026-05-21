package com.example.InterviewCoding23;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateAndFilterFromArray23 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 4, 5, 6, 7, 8 };
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

		List<Integer> filterArray = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] != array[j]) {
					flag = true;
				}
			}
			if (flag && !filterArray.contains(array[i]))
				filterArray.add(array[i]);
			
		}
		System.out.println(filterArray);
	}
}
