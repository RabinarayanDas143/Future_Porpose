package com.example.InterviewCoding10;

import java.util.HashMap;
import java.util.Map;

public class FindMinMaxNumberFromArray10 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 3, 6, 9, 7, 8, 10 };
		Map<String, Integer> map = getMinMaxFromArray(array);
		System.out.println(map);
	}

	private static Map<String, Integer> getMinMaxFromArray(int[] array) {
		Map<String, Integer> map = new HashMap<>();
		int Min = array[0];
		int Max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (Max < array[i]) {
				Max = array[i];
			} else if (Min > array[i]) {
				Min = array[i];
			}
		}
		map.put("Max", Max);
		map.put("Min", Min);
		return map;
	}
}
