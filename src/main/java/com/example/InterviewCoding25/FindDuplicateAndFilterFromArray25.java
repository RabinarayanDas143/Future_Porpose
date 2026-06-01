package com.example.InterviewCoding25;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateAndFilterFromArray25 {
	public static void main(String[] args) {
		int[] result = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 4, 5, 6, 7, 8 };

		List<Integer> duplicateNums = new ArrayList<>();
		for (int i = 0; i < result.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < result.length; j++) {
				if (result[i] == result[j]) {
					flag = true;
				}
			}
			if (flag && !duplicateNums.contains(result[i])) {
				duplicateNums.add(result[i]);
			}
		}
		System.out.println(duplicateNums);

		List<Integer> filterNums = new ArrayList<>();
		for (int i = 0; i < result.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < result.length; j++) {
				if (result[i] != result[j]) {
					flag = true;
				}
			}
			if (flag && !filterNums.contains(result[i]))
				filterNums.add(result[i]);
		}
		System.out.println(filterNums);
	}
}
