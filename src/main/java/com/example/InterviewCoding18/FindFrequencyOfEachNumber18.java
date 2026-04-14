package com.example.InterviewCoding18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequencyOfEachNumber18 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 3, 4, 5, 6, 7, 6, 7, 8, 9, 4, 5, 6, 7, 8, 10, 10 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i]))
				map.put(array[i], map.get(array[i]) + 1);
			else
				map.put(array[i], 1);
		}
		System.out.println(map);

		Map<Integer, Integer> map1 = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for (int i : array) {
			list.add(i);
		}
		for (int i = 0; i < list.size(); i++) {
			map1.putIfAbsent(list.get(i), Collections.frequency(list, list.get(i)));
		}
		System.out.println(map1);
	}
}
