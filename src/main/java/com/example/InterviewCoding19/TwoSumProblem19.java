package com.example.InterviewCoding19;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem19 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int target = 9;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			int need = target - array[i];
			if (map.containsKey(need)) {
				System.out.println("Two number are :" + array[i] + "," + need);
			} else {
				map.put(array[i], 1);
			}
		}
	}
}
