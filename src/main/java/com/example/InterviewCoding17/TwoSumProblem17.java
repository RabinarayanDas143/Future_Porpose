package com.example.InterviewCoding17;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem17 {
	public static void main(String[] args) {
		int[] array = { 10, 4, 6, 7, 9, 2 };
		int target = 9;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			int need = target - array[i];
			if (map.containsKey(need)) {
				System.out.println("Two num is :" + need + ", " + array[i]);
			} else {
				map.put(array[i], 1);
			}
		}
	}
}
