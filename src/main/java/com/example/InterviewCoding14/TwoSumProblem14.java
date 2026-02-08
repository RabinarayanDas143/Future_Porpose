package com.example.InterviewCoding14;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Length;

public class TwoSumProblem14 {
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

		// below code is applicatble for sorted array
//		int start = 0;
//		int end = array.length - 1;
//		while (start < end) {
//			int currentSum = array[start] + array[end];
//			if (currentSum == target) {
//				System.out.println("Two numbers is :" + array[start] + ", " + array[end]);
//				break;
//			} else if (currentSum < target) {
//				start++;
//			} else {
//				end--;
//			}
//		}

	}
}
