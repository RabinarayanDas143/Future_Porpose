package com.example.InterviewCoding11;

import java.util.HashMap;
import java.util.Map;

public class FindMinMaxNumberFromArray11 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 3, 6, 9, 7, 8, 10 };
		Map<String, Integer> map = getMinMaxFromArray(array);
		System.out.println(map);
	}

	public static Map<String, Integer> getMinMaxFromArray(int[] array) {
		int min = array[0];
		int max = array[0];
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			} else if (array[i] > max) {
				max = array[i];
			}
		}
		map.put("Min", min);
		map.put("Max", max);
		return map;
	}
}
