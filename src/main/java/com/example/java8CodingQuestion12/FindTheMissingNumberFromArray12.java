package com.example.java8CodingQuestion12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindTheMissingNumberFromArray12 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 10, 5, 8, 10 };
		int min = Arrays.stream(array).boxed().sorted((a, b) -> a - b).findFirst().get();
		int max = Arrays.stream(array).boxed().sorted((a, b) -> b - a).findFirst().get();
		List<Integer> list = Stream.iterate(min, n -> n + 1).limit(max)
				.filter(e -> !Arrays.stream(array).boxed().collect(Collectors.toList()).contains(e))
				.collect(Collectors.toList());
		System.out.println(list);
	}
}
