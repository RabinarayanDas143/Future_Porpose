package com.example.InterviewCoding26;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem26 {
	public static void main(String[] args) {
		int[] array = { 11, 44, 77, 99, 100 };
		int target = 111;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : array) {
			int need = target - i;
			if (map.containsKey(need)) {
				System.out.println("Two num is :" + i + "," + need);
			} else {
				map.put(i, 1);
			}
		}
	}
}
