package com.example.java8CodingQuestion9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArray9 {
	public static void main(String[] args) {
		int[] array1 = { 5, 2, 4, 3, 1 };
		int[] array2 = { 6, 9, 7, 8, 10 };

		List<Integer> list = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).boxed().sorted().distinct()
				.collect(Collectors.toList());
		System.out.println(list);
	}
}
