package com.example.java8CodingQuestion8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirst10EvenOddNumber8 {
	public static void main(String[] args) {
		List<Integer> evenlist = Stream.iterate(0, n -> n + 1).limit(10).filter(e -> e % 2 == 0)
				.collect(Collectors.toList());
		List<Integer> oddLiist = Stream.iterate(0, n -> n + 1).limit(10).filter(e -> e % 2 != 0)
				.collect(Collectors.toList());
		System.out.println(evenlist);
		System.out.println(oddLiist);
	}
}
