package com.example.java8CodingQuestion7;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstAndLast3Number7 {
	public static void main(String[] args) {
		int[] array = Stream.iterate(1, n -> n + 1).limit(10).collect(Collectors.toList()).stream().mapToInt(e -> e)
				.toArray();
		int[] first3FromArray = Arrays.stream(array).boxed().limit(3).collect(Collectors.toList()).stream()
				.mapToInt(e -> e).toArray();
		int[] last3FromArray = Arrays.stream(array).boxed().sorted((a, b) -> b - a).limit(3)
				.collect(Collectors.toList()).stream().mapToInt(e -> e).toArray();

		System.out.println("First 3 element from Array is :" + Arrays.toString(first3FromArray));
		System.out.println("Last 3 element from Array is :" + Arrays.toString(last3FromArray));
	}
}
