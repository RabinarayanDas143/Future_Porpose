package com.example.InterviewCoding14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequencyOfEachNumber14 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 3, 4, 5, 6, 7, 6, 7, 8, 9, 4, 5, 6, 7, 8, 10, 10 };
		Map<Integer, Integer> map = new HashMap<>();
//		for (int i : array) {
//			if (map.containsKey(i)) {
//				map.put(i, map.get(i) + 1);
//			} else {
//				map.put(i, 1);
//			}
//		}
//		System.out.println(map);
		List<Integer> list = new ArrayList<>();
		for(int i : array) {
			list.add(i);
		}
		for (int i : array) {
			map.putIfAbsent(i, Collections.frequency(list, i));
		}
		System.out.println(map);
	}
}
