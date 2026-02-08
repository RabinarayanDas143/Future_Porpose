package com.example.InterviewCoding14;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateAndFilterFromArray14 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

//		List<Integer> DuplicateList = new ArrayList<>();
//		for (int i = 0; i < array.length; i++) {
//			boolean duplicate = false;
//			for (int j = i + 1; j < array.length; j++) {
//				if (array[i] == array[j]) {
//					duplicate = true;
//				}
//			}
//			if (duplicate && !DuplicateList.contains(array[i])) {
//				DuplicateList.add(array[i]);
//			}
//		}
//		System.out.println("DuplicateList :" + DuplicateList);

		List<Integer> filterList = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			boolean filter = true;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					filter = false;
				}
			}
			if (!filterList.contains(array[i]) && filter) {
				filterList.add(array[i]);
			}
		}
		System.out.println("Filter Array is :" + filterList);
	}
}
