package com.example.java8CodingQuestion9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirst10EvenOddNumber9 {
	public static void main(String[] args) {
		List<Integer> list = Stream.iterate(0, n -> n + 1).limit(10).filter(e -> e % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(list);
	}
}
