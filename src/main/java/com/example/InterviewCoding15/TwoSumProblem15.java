package com.example.InterviewCoding15;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem15 {
	public static void main(String[] args) {
		int[] array = { 10, 4, 6, 7, 9, 2 };
		int target = 9;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			int need = target - array[i];
			if (map.containsKey(need)) {
				System.out.println("Two number is :" + need + ", " + array[i]);
				return;
			} else {
				map.put(array[i], i);
			}
		}
	}
}
