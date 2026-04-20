package com.example.java8CodingQuestion12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirst10EvenOddNumber12 {
	public static void main(String[] args) {
		List<Integer> evenNum = Stream.iterate(1, n -> n + 1).limit(10).filter(e -> e % 2 == 0)
				.collect(Collectors.toList());
		List<Integer> oddNum = Stream.iterate(1, n -> n + 1).limit(10).filter(e -> e % 2 != 0)
				.collect(Collectors.toList());
		System.out.println("evenNum :" + evenNum);
		System.out.println("oddNum :" + oddNum);
	}
}
