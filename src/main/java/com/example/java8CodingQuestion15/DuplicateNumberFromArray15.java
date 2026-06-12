package com.example.java8CodingQuestion15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNumberFromArray15 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5 };
		List<Integer> list = new ArrayList<>();
		List<Integer> res = Arrays.stream(array).boxed().filter(e -> list.contains(e) ? list.add(e) : !list.add(e))
				.collect(Collectors.toList());
		System.out.println(res);
	}
}
