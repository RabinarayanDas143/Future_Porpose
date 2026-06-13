package com.example.InterviewCoding27;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem27 {
	public static void main(String[] args) {
		int[] array = { 11, 44, 77, 99, 100 };
		int target = 111;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : array) {
			int need = target - i;
			if (map.containsKey(need)) {
				System.out.println("Two num is :" + need + "," + i);
			} else {
				map.put(i, 1);
			}
		}
	}
}
