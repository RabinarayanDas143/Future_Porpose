package com.example.InterviewCoding24;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateAndFilterFromArray24 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 4, 5, 6, 7, 8 };
		List<Integer> filteredList = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] != array[j]) {
					flag = true;
				}
			}
			if (!filteredList.contains(array[i]) && flag) {
				filteredList.add(array[i]);
			}
		}
		System.out.println("Filter array :" + filteredList);
		
		List<Integer> duplicateList = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					flag = true;
				}
			}
			if (!duplicateList.contains(array[i]) && flag) {
				duplicateList.add(array[i]);
			}
		}
		System.out.println("Duplicate array :" + duplicateList);
	}
}
