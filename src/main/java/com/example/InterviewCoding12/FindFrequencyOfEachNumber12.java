package com.example.InterviewCoding12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequencyOfEachNumber12 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 3, 4, 5, 6, 7, 6, 7, 8, 9, 4, 5, 6, 7, 8, 10, 10 };
		Map<Integer, Integer> map = getFrequencyofEachNum(array);
		System.out.println(map);
		// map.forEach((k, v) -> System.out.println(k + " " + v));

		Map<Integer, Integer> map1 = getFrequencyUsingBuiltin(array);
	}

	public static Map<Integer, Integer> getFrequencyUsingBuiltin(int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for (int i : array) {
			list.add(i);
		}
		for (int i = 0; i < array.length; i++) {
			map.putIfAbsent(array[i], Collections.frequency(list, array[i]));
		}
		return map;
	}

	public static Map<Integer, Integer> getFrequencyofEachNum(int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);
			} else {
				map.put(array[i], 1);
			}
		}
		return map;
	}
}
