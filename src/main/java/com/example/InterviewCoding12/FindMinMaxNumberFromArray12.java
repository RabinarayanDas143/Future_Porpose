package com.example.InterviewCoding12;

import java.util.HashMap;
import java.util.Map;

public class FindMinMaxNumberFromArray12 {
	public static void main(String[] args) {
		int[] array = { 5, 1, 4, 2, 3, 6, 9, 7, 8, 10 };
		Map<String, Integer> map = getMinMaxFromArray(array);
		System.out.println(map);
	}

	public static Map<String, Integer> getMinMaxFromArray(int array[]) {
		int min = array[0];
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			} else if (max < array[i]) {
				max = array[i];
			}
		}
		Map<String, Integer> map = new HashMap<>();
		map.put("Minimum", min);
		map.put("Maximum", max);
		
		return map;
	}
}
