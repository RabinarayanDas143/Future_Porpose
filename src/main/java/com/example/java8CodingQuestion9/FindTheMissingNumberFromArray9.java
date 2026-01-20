package com.example.java8CodingQuestion9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindTheMissingNumberFromArray9 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 1, 7, 8 };
		int min = Arrays.stream(array).boxed().sorted().distinct().findFirst().get();
		int max = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).distinct().findFirst().get();

		List<Integer> missing = Stream.iterate(min, n -> n + 1).limit(max)
				.filter(e -> !(Arrays.stream(array).boxed().collect(Collectors.toList()).contains(e)))
				.collect(Collectors.toList());
		System.out.println("missing :" + missing);
	}
}
