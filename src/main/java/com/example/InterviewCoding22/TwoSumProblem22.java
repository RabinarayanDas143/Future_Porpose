package com.example.InterviewCoding22;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem22 {
	public static void main(String[] args) {
		int[] array = { 11, 44, 77, 99, 100 };
		int target = 111;

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			int need = target - array[i];
			if (map.containsKey(need))
				System.out.println("Two numbewr is :" + need + " ," + array[i]);
			else
				map.put(array[i], 1);
		}
	}
}
