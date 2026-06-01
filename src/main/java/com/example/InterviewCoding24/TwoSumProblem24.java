package com.example.InterviewCoding24;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem24 {
	public static void main(String[] args) {
		int[] array = { 11, 44, 77, 99, 100 };
		int target = 111;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			int need = target - array[i];
			if (map.containsKey(need))
				System.out.println("Two number is :" + array[i] + " , " + need);
			else
				map.put(array[i], 1);
		}
	}
}
