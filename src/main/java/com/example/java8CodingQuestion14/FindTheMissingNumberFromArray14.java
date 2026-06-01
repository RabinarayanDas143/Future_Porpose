package com.example.java8CodingQuestion14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindTheMissingNumberFromArray14 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 10, 5, 8, 10 };
		int min = Arrays.stream(array).min().getAsInt();
		int max = Arrays.stream(array).max().getAsInt();
		List<Integer> list = Stream.iterate(min, n -> n + 1).limit(max)
				.filter(e -> !Arrays.stream(array).boxed().collect(Collectors.toList()).contains(e))
				.collect(Collectors.toList());
		System.out.println(list);
	}
}
