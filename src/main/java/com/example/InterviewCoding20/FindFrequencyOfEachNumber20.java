package com.example.InterviewCoding20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequencyOfEachNumber20 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 4, 5, 6, 7, 8, 5, 6, 7 };
		Map<Integer, Integer> map = new HashMap<>();
//		for (int i = 0; i < array.length; i++) {
//			if (map.containsKey(array[i]))
//				map.put(array[i], map.get(array[i]) + 1);
//			else
//				map.put(array[i], 1);
//		}
//		System.out.println(map);

		List<Integer> list = new ArrayList<>();
		for (int i : array) {
			list.add(i);
		}
		for (int i : list) {
			map.putIfAbsent(i, Collections.frequency(list, i));
		}
		System.out.println(map);
	}
}
