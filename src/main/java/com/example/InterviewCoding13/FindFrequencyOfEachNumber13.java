package com.example.InterviewCoding13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequencyOfEachNumber13 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 3, 4, 5, 6, 7, 6, 7, 8, 9, 4, 5, 6, 7, 8, 10, 10 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);
			} else {
				map.put(array[i], 1);
			}
		}
		//System.out.println(map);

		Map<Integer, Integer> map1 = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for (int num : array) {
			list.add(num);
		}

		for (int i = 0; i < array.length; i++) {
			map1.putIfAbsent(array[i], Collections.frequency(list, array[i]));
		}
		
		System.out.println(map1);
		
		Map<Integer, Integer> map2 = new HashMap<>();
		for(int i: array) {
			map2.put(i, map2.getOrDefault(i, 0)+1);
		}
		System.out.println(map2);
	}
}
