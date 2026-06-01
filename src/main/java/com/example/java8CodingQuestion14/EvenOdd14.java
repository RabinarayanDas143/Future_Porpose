package com.example.java8CodingQuestion14;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd14 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Map<Boolean, List<Integer>> list = Arrays.stream(array).boxed()
				.collect(Collectors.partitioningBy(e -> e % 2 == 0));
		System.out.println(list.get(true));
		System.out.println(list.get(false));
	}
}
