package com.example.java8CodingQuestion12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd12 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> even = Arrays.stream(array).boxed().filter(e -> e % 2 == 0).collect(Collectors.toList());
		List<Integer> odd = Arrays.stream(array).boxed().filter(e -> e % 2 != 0).collect(Collectors.toList());
		System.out.println("even :" + even);
		System.out.println("odd :" + odd);

		Map<Boolean, List<Integer>> map = Arrays.stream(array).boxed()
				.collect(Collectors.partitioningBy(e -> e % 2 == 0));
		System.out.println("Even :" + map.get(true));
		System.out.println("Odd :" + map.get(false));
	}
}
