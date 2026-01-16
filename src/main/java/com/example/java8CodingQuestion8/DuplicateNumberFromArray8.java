package com.example.java8CodingQuestion8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateNumberFromArray8 {
	public static void main(String[] args) {
		int[] array = { 1,2,3,4,5,3,4 };
		List<Integer> list = new ArrayList<>();
		List<Integer> duplicateList = Arrays.stream(array).boxed()
				.filter(e -> list.contains(e) ? list.add(e) : !list.add(e)).collect(Collectors.toList());
		System.out.println(duplicateList);
	}
}
