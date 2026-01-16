package com.example.java8CodingQuestion8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindTheMissingNumberFromArray8 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 1, 7, 8 };

		int min = Arrays.stream(array).boxed().sorted().findFirst().get();
		int max = Arrays.stream(array).boxed().sorted((a, b) -> b - a).findFirst().get();

		List<Integer> list = Arrays.stream(array).boxed().distinct().collect(Collectors.toList());
		List<Integer> missing = IntStream.iterate(min, n -> n + 1).limit(max).boxed().filter(e -> !list.contains(e))
				.collect(Collectors.toList());
		System.out.println(missing);
	}
}
