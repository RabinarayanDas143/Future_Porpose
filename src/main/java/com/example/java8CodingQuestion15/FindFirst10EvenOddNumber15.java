package com.example.java8CodingQuestion15;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirst10EvenOddNumber15 {
	public static void main(String[] args) {
		Map<Boolean, List<Integer>> map = Stream.iterate(0, n -> n + 1).limit(10)
				.collect(Collectors.partitioningBy(e -> e % 2 == 0));
		System.out.println("Even :" + map.get(true));
		System.out.println("Odd :" + map.get(false));
	}
}
