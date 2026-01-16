package com.example.InterviewCoding11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMultipleMissingNumber11 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 7, 9, 9, 10 };
		List<Integer> list = getMissingNumber(array);
		System.out.println(list);
	}

	public static List<Integer> getMissingNumber(int[] array) {
		int first = array[0];
		int last = array[array.length - 1];
		List<Integer> result = new ArrayList<>();
		List<Integer> list = Stream.iterate(first, n -> n + 1).limit(last).collect(Collectors.toList());
		Set<Integer> set = new HashSet<>();
		for (int i : array) {
			set.add(i);
		}
		for (int i : list) {
			if (!set.contains(i)) {
				result.add(i);
			}
		}
		return result;
	}
}
