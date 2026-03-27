package com.example.InterviewCoding15;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateAndFilterFromArray15 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> duplicateNumber = new ArrayList<>();
		List<Integer> filterList = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					flag = true;
				}
			}
			if (flag && !duplicateNumber.contains(array[i])) {
				duplicateNumber.add(array[i]);
			}
		}
		System.out.println("Duplicate numbers is " + duplicateNumber);

		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					flag = true;
				}
			}
			if (!flag && !filterList.contains(array[i])) {
				filterList.add(array[i]);
			}
		}
		System.out.println("Filter Array is :" + filterList);
	}
}
