package com.example.InterviewCoding11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequencyOfEachNumber11 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 3, 4, 5, 6, 7, 6, 7, 8, 9, 4, 5, 6, 7, 8, 10, 10 };
		Map<Integer, Integer> frequency = getFrequency(array);
//		for (Map.Entry<Integer, Integer> map : frequency.entrySet()) {
//			System.out.println(map.getKey() + " " + map.getValue());
//		}

		Map<Integer, Integer> frequUsingBuiltInFun = getFrequencyUsingBuiltInFun(array);
		//System.out.println(frequUsingBuiltInFun);

	}

	public static Map<Integer, Integer> getFrequencyUsingBuiltInFun(int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for (int i : array) {
			list.add(i);
		}
		for (int i : list) {
			map.putIfAbsent(i, Collections.frequency(list, i));
		}

		return map;
	}

	public static Map<Integer, Integer> getFrequency(int[] array) {
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
