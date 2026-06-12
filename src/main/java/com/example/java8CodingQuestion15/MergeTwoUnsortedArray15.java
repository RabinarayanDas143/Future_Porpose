package com.example.java8CodingQuestion15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoUnsortedArray15 {
	public static void main(String[] args) {
		int[] array1 = { 5, 4, 3, 2, 1 };
		int[] array2 = { 10, 9, 8, 7, 6 };
		List<Integer> list = Stream.concat(Arrays.stream(array1).boxed(), Arrays.stream(array2).boxed()).sorted()
				.collect(Collectors.toList());
		System.out.println(list);
	}
}
